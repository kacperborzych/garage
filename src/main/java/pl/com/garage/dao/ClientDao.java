package pl.com.garage.dao;

import org.springframework.stereotype.Repository;
import pl.com.garage.model.Client;

import java.util.List;


public interface ClientDao {

    void addClient (String name, String model);

    Client findClient (int id);

    void updateClient (String name, String model);

    void delateClient (String name);

    List<Client> findAllClient();
}
