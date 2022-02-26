package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ActivityTrackerMain {
    public static void main(String[] args) {

        MariaDbDataSource dSource = new MariaDbDataSource();
        try {
            dSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dSource.setUserName("activitytracker");
            dSource.setPassword("activitytracker");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Database unreachable!", sqle);
        }

        Flyway flyway = Flyway.configure().locations("db/flyway").dataSource(dSource).load();
        flyway.clean();
        flyway.migrate();

        Activity actHiking = new Activity(LocalDateTime.of(2022, 1, 16, 5, 12),
                "dunakömlődi sípálya", ActivityType.HIKING);

        actHiking.addTrackPoint(new TrackPoint(LocalDate.of(2022, 1, 15), 50, 60));
        actHiking.addTrackPoint(new TrackPoint(LocalDate.of(2022, 1, 14), 45, 10));

        Activity actRunning = new Activity(LocalDateTime.of(2022, 2, 3, 15, 45),
                "Keskeny utca", ActivityType.RUNNING);
        actRunning.addTrackPoint(new TrackPoint(LocalDate.of(2022, 2, 2), -15, 0));
        actRunning.addTrackPoint(new TrackPoint(LocalDate.of(2022, 2, 1), 9, 26));

        ActivityDAO aDAO = new ActivityDAO(dSource);
        System.out.println("Mentés1: ");
        System.out.println(aDAO.saveActivity(actHiking));
        System.out.println("Mentés2: ");
        System.out.println(aDAO.saveActivity(actRunning));

        System.out.println("Listázás: ");
        System.out.println(aDAO.listActivities());

        System.out.println("Második id: ");
        System.out.println(aDAO.findActivityById(2));
    }
}
