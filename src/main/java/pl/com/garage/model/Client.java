package pl.com.garage.model;


public class Client {
    private int id;
    private String name;
    private String carModel;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
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


