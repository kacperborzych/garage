package pl.com.garage.giu;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.com.garage.service.*;

public class MainApp {
    public static void main(String[] args) {


        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("spring.xml");

        ClientService clientService = abstractApplicationContext.getBean(ClientService.class);
        EmployeeService employeeService = abstractApplicationContext.getBean(EmployeeService.class);
        MagazineService magazineService = abstractApplicationContext.getBean(MagazineService.class);
        OrderService orderService = abstractApplicationContext.getBean(OrderService.class);
        RepairService repairService = abstractApplicationContext.getBean(RepairService.class);
    }
}
