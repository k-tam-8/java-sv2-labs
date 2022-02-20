package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
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
        flyway.migrate();

        Activity actHiking = new Activity(1, LocalDateTime.of(2022,1,16,5,12),
                "dunakömlődi sípálya", ActivityType.HIKING);

        Activity actRunning = new Activity(1, LocalDateTime.of(2022,2,3,15,45),
                "Keskeny utca", ActivityType.RUNNING);

        ActivityController ac = new ActivityController();
        ac.addActivityToDb(actHiking,dSource);
        ac.addActivityToDb(actRunning,dSource);
    }
}
