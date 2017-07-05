package pl.com.garage.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.com.garage.service.ClientService;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class ClientDaoImplTest {

    @Autowired
    private ClientService clientService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void shouldAddClient() throws Exception{

        //given
        String testName = "Kamil";

        //when
        clientService.addClient("Kamil", "Alfa");

        //then
        jdbcTemplate.queryForObject("SELECT * FROM client WHERE name= testName");
    }


}