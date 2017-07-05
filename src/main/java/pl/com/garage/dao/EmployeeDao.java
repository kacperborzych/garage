package pl.com.garage.dao;


import pl.com.garage.model.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> findAll();
}
