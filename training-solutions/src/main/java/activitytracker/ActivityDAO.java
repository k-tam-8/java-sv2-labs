package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityDAO {

    private MariaDbDataSource mariaDbDataSource;

    public ActivityDAO(MariaDbDataSource mariaDbDataSource) {
        this.mariaDbDataSource = mariaDbDataSource;
    }

    public Activity saveActivity(Activity activity) {
        try (Connection connection = mariaDbDataSource.getConnection()) {
            connection.setAutoCommit(false);
            try (PreparedStatement stat = connection.prepareStatement("insert into activities(start_time, description, activity_type) values(?,?,?)",
                    Statement.RETURN_GENERATED_KEYS)) {
                //FELTÉTEL
                stat.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
                stat.setString(2, activity.getDescription());
                stat.setString(3, activity.getActivityType().toString());
                try (ResultSet rs = stat.getGeneratedKeys()) {
                    if (rs.next()) {
                        activity.setId((int) rs.getLong(1));
                        saveTrackPointsToDB(activity);
                    } else throw new IllegalStateException("Insert failed");
                }
                stat.executeUpdate();
                connection.commit();
            } catch (IllegalArgumentException iae) {
                connection.rollback();
            }


        } catch (SQLException sql) {
            throw new IllegalStateException("Cannot update ", sql);
        }

        return activity;
    }

    public void saveTrackPointsToDB(Activity activity) {
        try (Connection connection = mariaDbDataSource.getConnection();
             PreparedStatement stat = connection.prepareStatement("insert into track_point(time, lat, lon, activity_id) values(?,?,?,?)", Statement.RETURN_GENERATED_KEYS)) {
            for (int i = 0; i < activity.getTrackPoints().size(); i++) {
                stat.setDate(1, Date.valueOf(activity.getTrackPoints().get(i).getTime()));
                stat.setLong(2, activity.getTrackPoints().get(i).getLat());
                stat.setLong(3, activity.getTrackPoints().get(i).getLon());
                stat.setLong(4, activity.getId());
                ResultSet rs = stat.getGeneratedKeys();
                stat.executeUpdate();
            }

           /* try (ResultSet rs = stat.getGeneratedKeys()) {
                if (rs.next()) {
                    for (TrackPoint tp : activity.getTrackPoints()) {
                        tp.setId((int) rs.getLong("id"));
                    }
                }
                //throw new IllegalStateException("Insert failed");
            }*/

        } catch (SQLException sql) {
            throw new IllegalStateException("Cannot update ", sql);
        }
    }

    public List<Activity> listActivities() {
        List<Activity> activities = new ArrayList<>();
        try (Connection conn = mariaDbDataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM activities")) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Activity importActivity = new Activity((int) rs.getLong("id"),
                            rs.getTimestamp("start_time").toLocalDateTime(),
                            rs.getString("description"),
                            ActivityType.valueOf(rs.getString("activity_type")));
                    activities.add(importActivity);
                }
            } catch (SQLException sqle) {
                throw new IllegalStateException("Not found.");
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("SQL error: ", sqle);
        }
        return activities;
    }

    public Activity findActivityById(long id) {
        try (Connection conn = mariaDbDataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM activities WHERE id = ?")) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Activity importActivity = new Activity((int) rs.getLong("id"),
                            rs.getTimestamp("start_time").toLocalDateTime(),
                            rs.getString("description"),
                            ActivityType.valueOf(rs.getString("activity_type")));
                    importTrackPoints(id, importActivity);
                    return importActivity;
                } else return null;
            } catch (SQLException sqle) {
                throw new IllegalStateException("Not found.");
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("SQL error: ", sqle);
        }
    }

    public Activity importTrackPoints(long id, Activity activity) {
        // List<TrackPoint> trackPoints = new ArrayList<>();
        try (Connection conn = mariaDbDataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM track_point WHERE activity_id = ?")) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    TrackPoint importedTP = new TrackPoint((int) rs.getLong("id"),
                            rs.getDate("time").toLocalDate(),
                            (int) rs.getLong("lat"),
                            (int) rs.getLong("lon"));
                    activity.addTrackPoint(importedTP);
                } else throw new IllegalStateException("No result found.");
            } catch (SQLException sqle) {
                throw new IllegalStateException("Not found.");
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("SQL error: ", sqle);
        }
        return activity;
    }

}
