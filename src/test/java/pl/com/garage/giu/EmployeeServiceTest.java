package pl.com.garage.giu;


import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.com.garage.model.Employee;
import pl.com.garage.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class EmployeeServiceTest {

    private EmployeeService employeeService;

    @Before
    public void before(List<Employee> employeeList){
        Employee inputEmployee1 = new Employee("Adam", "Kiszka", 1500 );
        Employee inputEmployee2 = new Employee("Marcin", "Norys", 2200 );

        List<Employee> inputEmployeeList = new ArrayList<>();

        inputEmployeeList.add(inputEmployee1);
        inputEmployeeList.add(inputEmployee2);
    }

    @Test
    public void shouldReturnAllWorkers() throws Exception{

        //given


        //when
        List<Employee> employeeList = employeeService.findAll();

        //then
        assertThat(employeeList).isNotNull();
        assertThat(employeeList).isEqualTo(2);
    }

    @Test
    public void shouldAddNewWorker() throws Exception{

    }

    @Test
    public void shouldFindWorkerById() throws Exception{

    }

    @Test
    public void ShouldEditWorker() throws Exception{

    }
}
