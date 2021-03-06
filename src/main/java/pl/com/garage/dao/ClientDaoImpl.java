package pl.com.garage.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import pl.com.garage.model.Client;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ClientDaoImpl implements ClientDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

/*
    private RowMapper<Client> clientRowMapper = (resultSet, rowNum) -> {

        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        String surname = resultSet.getString("surname");

        return new Client(id, name, surname); };
*/

    private RowMapper<Client> getClientRowMapper(){
        return new RowMapper<Client>() {
            @Override
            public Client mapRow(ResultSet resultSet, int i) throws SQLException {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String model = resultSet.getString("model");
                return new Client(id, name, model);
            }
        };
    }

    @Override
    public void addClient(String name, String model) {
        jdbcTemplate.update("insert into client (name, model) values (?,?)", name, model);
    }

    @Override
    public Client findClient(int id) {
       return jdbcTemplate.queryForObject("SELECT * FROM client WHERE id = ?", getClientRowMapper(), id);
    }

    @Override
    public void updateClient(String name, String model) {
        jdbcTemplate.update("UPDATE client SET model =? WHERE name =?", model, name);
    }

    @Override
    public void delateClient(String name) {
        jdbcTemplate.update("DELETE FROM client WHERE name = ?", name);
    }

    @Override
    public List<Client> findAllClient() {
        return jdbcTemplate.query("SELECT * FROM client", getClientRowMapper());
    }
}
