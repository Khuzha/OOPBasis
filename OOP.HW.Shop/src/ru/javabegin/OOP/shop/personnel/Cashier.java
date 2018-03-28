package ru.javabegin.OOP.shop.personnel;

public class Cashier {

    private double cost;
    private int sallary;
    private String name;


    public Cashier(double cost, int sallary, String name) {
        this.cost = cost;
        this.sallary = sallary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getSallary() {
        return sallary;
    }

    public void setSallary(int sallary) {
        this.sallary = sallary;
    }
}
