package pl.com.garage.rest;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import pl.com.garage.model.Client;

import static org.junit.Assert.*;


public class RestControllerTest {

    private static final String BASE_URL = "http://localhost:8080/garage";

    RestTemplate restTemplate = new RestTemplate();

    @Test
    public void shouldListOfClient() throws Exception {

        Client[] clients = restTemplate.getForObject("http://localhost:8080/garage/rest/list", Client[].class);

        Assertions.assertThat(clients).isNotNull();
        Assertions.assertThat(clients.length).isGreaterThan(0);
    }

    @Test
    public void shouldSaveClient() throws Exception {

        Client client = new Client(0, "Aleksander", "passat");

        String respone = restTemplate.getForObject(BASE_URL + "/rest/save2/{name}/{model}", String.class, "Aleksander", "passat");

        Assertions.assertThat(respone).contains("Zapisano");
        Assertions.assertThat(respone).contains("Aleksander");
    }

    @Test
    public void shouldDeleteClient() throws Exception {

    }
}