package pl.com.garage.model;

import org.springframework.stereotype.Component;

@Component
public class Client {
    private int id;
    private String name;
    private String model;

    public Client() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getCarModel() {
        return model;
    }


    public Client(int id,String name, String carModel) {
        this.id = id;
        this.name = name;
        this.model = carModel;

    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", carModel='" + model + '\'' +
                '}';
    }
}


