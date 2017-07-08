package pl.com.garage.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.garage.dao.EmployeeDao;
import pl.com.garage.model.Employee;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public void addEmployee(String name, String surname, double salary){
        employeeDao.addEmployee(name, surname,salary);
    }

    public Employee findEmployeeBySurname(String surname){
       return employeeDao.findEmployeeBySurname(surname);
    }

    public void updateSalaryEmployee(String name, double salary){
        employeeDao.updateSalaryEmployee(salary, name);
    }

    public void deleteEmployee(String name, String surname){
        employeeDao.deleteEmployee(name, surname);
    }

    public List<Employee> findAllEmployees(){
        return employeeDao.findAllEmployees();
    }
}

