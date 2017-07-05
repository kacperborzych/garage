package pl.com.garage.model;


import java.util.Date;

public class Repair {

    private int idRepair;
    private String nameRepair;
    private double cost;
    private Date repairTime;

    public Repair(int idRepair, String nameRepair, double cost, Date repairTime) {
        this.idRepair = idRepair;
        this.nameRepair = nameRepair;
        this.cost = cost;
        this.repairTime = repairTime;
    }
}
