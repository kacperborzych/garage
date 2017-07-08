package pl.com.garage.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import pl.com.garage.model.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<Employee> getEmployeeRowMapper(){
        return (resultSet, i) -> {
         int id = resultSet.getInt("id");
         String name = resultSet.getString("name");
         String surname = resultSet.getString("surname");
         double salary = resultSet.getDouble("salary");
         return new Employee(id, name, surname, salary);
        };
    }
    private List<Employee> employeeList;

    @Override
    public void addEmployee(String name, String surname, double salary) {
        jdbcTemplate.update("INSERT INTO employee (name, surname, salary) VALUES (?,?,?)", name, surname, salary);

    }

    @Override
    public Employee findEmployeeBySurname(String surname) {
        return jdbcTemplate.queryForObject("SELECT * FROM employee WHERE surname = ?", getEmployeeRowMapper(), surname);
    }

    @Override
    public void updateSalaryEmployee(double salary, String name) {
        jdbcTemplate.update("UPDATE employee SET salary =? WHERE name =?", salary, name);       //TODO nie działa kiedy jest rowMapper
    }

    @Override
    public void deleteEmployee(String name, String surname) {
        jdbcTemplate.update("DELETE FROM employee where name = ? and surname = ?", name, surname); //TODO j.w.
    }

    @Override
    public List<Employee> findAllEmployees() {
        return jdbcTemplate.query("SELECT * FROM employee", getEmployeeRowMapper());
    }
}
