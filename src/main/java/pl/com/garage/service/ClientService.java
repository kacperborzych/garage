package pl.com.garage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.garage.dao.ClientDao;
import pl.com.garage.model.Client;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientDao clientDao;

    public void addClient(String name, String model) {
        clientDao.addClient(name, model);
    }

    public Client findClient(int id) {
       return clientDao.findClient(id);
    }

    public void updateClient(String name, String model) {
        clientDao.updateClient(name, model);
    }

    public void delateClient(String name) {
        clientDao.delateClient(name);
    }

    public List<Client> findAllClient() {
        return clientDao.findAllClient();
    }
}
