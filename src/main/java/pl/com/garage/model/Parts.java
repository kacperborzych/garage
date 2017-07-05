package pl.com.garage.model;


import java.util.List;

public class Parts {

    private String partname;
    private double partPrice;
    private List<Integer> partNumber;

    public Parts(String partname, double partPrice, List<Integer> partNumber) {

        this.partname = partname;
        this.partPrice = partPrice;
        this.partNumber = partNumber;
    }

    public String getPartname() {
        return partname;
    }

    public void setPartname(String partname) {
        this.partname = partname;
    }

    public double getPartPrice() {
        return partPrice;
    }

    public void setPartPrice(double partPrice) {
        this.partPrice = partPrice;
    }

    public List<Integer> getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(List<Integer> partNumber) {
        this.partNumber = partNumber;
    }

    @Override
    public String toString() {
        return "Parts{" +
                "partname='" + partname + '\'' +
                ", partPrice=" + partPrice +
                ", partNumber=" + partNumber +
                '}';
    }
}
