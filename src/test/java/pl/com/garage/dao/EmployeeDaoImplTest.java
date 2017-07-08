package pl.com.garage.dao;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.com.garage.model.Employee;
import pl.com.garage.service.EmployeeService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class EmployeeDaoImplTest {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Before
    public void before() {
        jdbcTemplate.execute("truncate employee");
        employeeService.addEmployee("Karol", "Wozniak", 2700);
        employeeService.addEmployee("Tomek", "Morek", 1600);
    }


    @Test
    public void shouldAddEmployee() throws Exception {
        //given
        employeeService.addEmployee("Anna", "Sobota", 2200);
        //when

        Long countEmployee = jdbcTemplate.queryForObject("SELECT COUNT (*) FROM employee",  Long.class);

        //then
        Assertions.assertThat(countEmployee).isEqualTo(3);
    }

    @Test
    public void shouldFindEmployeeBySurname() throws Exception {
        //given

        Employee employee = employeeService.findEmployeeBySurname("Wozniak");

        //when
      //  String finderEmployee = jdbcTemplate.queryForObject("SELECT * FROM employee WHERE SURNAME =?", String.class, "Wozniak");
        //than
        Assertions.assertThat(employee.getName()).isEqualTo("Karol");
    }

    @Test
    public void ShouldUpdateEmployeeSalary() throws Exception {
        //given
        employeeService.updateSalaryEmployee("Tomek", 4000);
        //when
        Double updateSalary = jdbcTemplate.queryForObject("SELECT salary FROM employee WHERE name=?", Double.class, "Tomek");

        //when
       Assertions.assertThat(updateSalary).isEqualTo(4000);
    }

    @Test
    public void shoulDelateEmployee() throws Exception {

        //given
        employeeService.deleteEmployee("Karol", "Wozniak");
        //when
        Integer count = jdbcTemplate.queryForObject("SELECT COUNT (*) FROM employee", Integer.class);

        //then
        Assertions.assertThat(count).isEqualTo(1);
    }

    @Test
    public void shouldFindAllEmployees() throws Exception {

        //given
        List<Employee> employeeList = employeeService.findAllEmployees();

        //when

        //then
        Assertions.assertThat(employeeList.size()).isEqualTo(2);
    }
}


