package pl.com.garage.giu;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import pl.com.garage.service.*;

public class MainApp {
    public static void main(String[] args) {


        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        ClientService clientService = applicationContext.getBean(ClientService.class);
        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
        MagazineService magazineService = applicationContext.getBean(MagazineService.class);
        OrderService orderService = applicationContext.getBean(OrderService.class);
        RepairService repairService = applicationContext.getBean(RepairService.class);


        employeeService.addEmployee("Karol", "Mizga", 3200);
        employeeService.updateSalaryEmployee("Karol", 1190);

        applicationContext.close();
    }
}
