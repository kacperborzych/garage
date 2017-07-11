package pl.com.garage.model;

import org.springframework.stereotype.Component;

@Component
public class Client {
    private int id;
    private String name;
    private String carModel;

    public Client() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getCarModel() {
        return carModel;
    }


    public Client(int id,String name, String carModel) {
        this.id = id;
        this.name = name;
        this.carModel = carModel;

    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}


