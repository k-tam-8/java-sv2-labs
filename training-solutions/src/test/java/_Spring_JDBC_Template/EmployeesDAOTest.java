package _Spring_JDBC_Template;

import org.flywaydb.core.Flyway;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesDAOTest {
    private EmployeesDAO employeesDAO;

    @Before
    public void init() throws SQLException {
        MariaDbDataSource dSource = new MariaDbDataSource();
        dSource.setUrl("jdbc:mariadb://localhost:3306/movies-actors?useUnicode=true");
        dSource.setUserName("root");
        dSource.setPassword("root");

        Flyway flyway = Flyway.configure().dataSource(dSource).load();
        flyway.clean();
        flyway.migrate();

        employeesDAO = new EmployeesDAO(dSource);

    }

    @Test
    void testCreate() {
        employeesDAO.createEmployee("John");
        List<String> names = employeesDAO.listEmployees();
        assertEquals(List.of("John"), names);
    }

    @Test
    void name() {
        long id = employeesDAO.createEmployee(("John"));
        System.out.println(id);

        String name = employeesDAO.findEmployeeNameById(id);
        assertEquals("John", name);
    }
}