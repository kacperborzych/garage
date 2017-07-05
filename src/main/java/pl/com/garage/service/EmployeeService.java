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

    public List<Employee> findAll(){
        return employeeDao.findAll();

    }
}
