package pl.com.garage.dao;

import org.springframework.stereotype.Repository;
import pl.com.garage.model.Employee;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    private List<Employee> employeeList;

    public List<Employee> findAll(){
        return employeeList;
    }
}
