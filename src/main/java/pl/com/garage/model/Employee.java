package pl.com.garage.model;


public class Employee {

   private int id;
   private String name;
   private String surname;
   private double salary;

   public Employee(int id, String name, String surname, double salary) {
      this.id = id;
      this.name = name;
      this.surname = surname;
      this.salary = salary;
   }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }
}
