package pl.com.garage.dao;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.com.garage.model.Client;
import pl.com.garage.service.ClientService;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class ClientDaoImplTest {


    @Autowired
    private ClientService clientService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Before
    public void before() {
        jdbcTemplate.execute("truncate client");
    }

    @Test
    public void shouldAddClient() throws Exception {

        //given

        //when
        clientService.addClient("Kamil", "Alfa");

        //then
        Long countCliens = jdbcTemplate.queryForObject("select count(*) from client where name like ?", Long.class, "Kamil");
        Assertions.assertThat(countCliens).isEqualTo(1);
    }

    @Test
    public void shouldFindClientById() throws Exception {

        //given
        clientService.addClient("Kamila", "Alfa");
        Integer id = jdbcTemplate.queryForObject("select max(id) from client", Integer.class);

        //when
        Client outPutClient = clientService.findClient(id);

        //then
        Assertions.assertThat(outPutClient.getId()).isEqualTo(id);
        Assertions.assertThat(outPutClient.getName()).isEqualTo("Kamila");
    }

    @Test
    public void shouldUpdateClient() throws Exception {

        //given
        clientService.addClient("Kamila", "Alfa");

        //when
        clientService.updateClient("Kamila", "Ford");

        //then
        String updateEvidence = jdbcTemplate.queryForObject("SELECT model FROM client WHERE name = ?", String.class, "Kamila");
        Assertions.assertThat(updateEvidence).isEqualTo("Ford");
    }

    @Test
    public void shouldDelateClient() throws Exception {

        //given
        clientService.addClient("Kamil", "Alfa");
        clientService.addClient("Asia", "Omega");

        //when
        clientService.delateClient("Kamil");
        Integer countClients = jdbcTemplate.queryForObject("SELECT count(*) FROM client", Integer.class);
        //then
        Assertions.assertThat(countClients).isEqualTo(1);
    }

    @Test
    public void shouldFindAllClients() throws Exception {

        //then
        clientService.addClient("Kamila", "Alfa");

        //when
        List<Client> outPutClientList = clientService.findAllClient();

        //given
        Assertions.assertThat(outPutClientList.size()).isEqualTo(1);
    }
}
