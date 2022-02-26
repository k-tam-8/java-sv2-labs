package _Spring_JDBC_Template;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

public class EmployeesDAO {

    private JdbcTemplate jdbcTemplate;

    public EmployeesDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

  /*  public void createEmployee(String name) {
        jdbcTemplate.update("insert into employees(emp_name) values (?)", name);
    }*/

    public long createEmployee(String name) {
        KeyHolder holder = new GeneratedKeyHolder();

        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement("insert into employees(emp_name) values (?)",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
            return ps;
        }, holder);

        return holder.getKey().longValue();

    }

    public String findEmployeeNameById(long id){
        return jdbcTemplate.queryForObject("select emp_name from employees where id = ?",
                (rs, rowNum) -> rs.getString("emp_name"), id);
    }


    public List<String> listEmployees() {
        return jdbcTemplate.query("select emp_name from employees",
                (rs, rowNum) -> rs.getString("emp_name"));
    }

}
