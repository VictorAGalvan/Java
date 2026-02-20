package entities;

import java.util.ArrayList;

public class Employee {
    private String name;
    private double grossSalary;
    private int id;
    public void icreaseSalary(double percentage){
        grossSalary += grossSalary * (percentage/100);
    }

    public String toString() {
        return id +
                ", " +name +
                ", " + grossSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public int getId() {
        return id;
    }

    public boolean setId(int id, ArrayList<Employee>employees) {
        for (Employee idVerification: employees){
            if (idVerification.getId() == id){
                System.out.println("Id já existe, parando a execução!");
                return false;
            }
        }
        this.id = id;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
