package ru.javabegin.OOP.inheritance.Model;

public class Operator extends Modifications{
    private String name;
    private double cost;

    public Operator(double aboutCost, boolean androidornot, String name, double cost, String name1, double cost1, String name2, String series, double cost2, String audithory, int amountOfSales, String counrty, String name3, String features, double cost3, String name4, double cost4) {
        super(aboutCost, androidornot, name, cost, name1, cost1, name2, series, cost2, audithory, amountOfSales, counrty, name3, features, cost3);
        this.name = name4;
        this.cost = cost4;
    }
}
