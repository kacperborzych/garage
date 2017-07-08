package pl.com.garage.dao;


import pl.com.garage.model.Employee;

import java.util.List;

public interface EmployeeDao {

    void addEmployee(String name, String surname, double salary);

    Employee findEmployeeBySurname(String surname);

    void updateSalaryEmployee(double salary, String name);

    void deleteEmployee(String name, String surname);

    List<Employee> findAllEmployees();
}
