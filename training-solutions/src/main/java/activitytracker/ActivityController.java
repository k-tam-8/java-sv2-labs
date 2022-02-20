package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;

public class ActivityController {

    public void addActivityToDb(Activity activity, MariaDbDataSource dSource) {
        try (Connection connection = dSource.getConnection();
             PreparedStatement stat = connection.prepareStatement("insert into activities(start_time, description, activity_type) values(?,?,?)")) {
            stat.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stat.setString(2, activity.getDescription());
           // stat.setString(3, activity.getActivityType().getStatus());
            stat.executeUpdate();

        } catch (SQLException sql) {
            throw new IllegalStateException("Cannot update ", sql);
        }

    }
}
