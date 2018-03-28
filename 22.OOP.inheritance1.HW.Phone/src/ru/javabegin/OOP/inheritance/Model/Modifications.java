package ru.javabegin.OOP.inheritance.Model;

public class Modifications extends Phone {

    private String name;
    private String features;
    private double cost;

    public Modifications(double aboutCost, boolean androidornot, String name, double cost, String name1, double cost1, String name2, String series, double cost2, String audithory, int amountOfSales, String counrty, String name3, String features, double cost3) {
        super(aboutCost, androidornot, name, cost, name1, cost1, name2, series, cost2, audithory, amountOfSales, counrty);
        this.name = name3;
        this.features = features;
        this.cost = cost3;
    }
}
