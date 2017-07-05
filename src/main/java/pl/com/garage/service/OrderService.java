package pl.com.garage.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.garage.dao.*;
import pl.com.garage.model.Employee;


@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private ClientDao clientDao;

    @Autowired
    private PartsDao partsDao;

    @Autowired
    private RepairDao repairDao;

    @Autowired
    private MagazienDao magazienDao;

}
