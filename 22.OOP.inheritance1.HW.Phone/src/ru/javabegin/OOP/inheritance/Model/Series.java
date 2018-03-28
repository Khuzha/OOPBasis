package ru.javabegin.OOP.inheritance.Model;

public class Series extends Class {

    private String name;
    private double cost;

    public Series(double aboutCost, boolean androidornot, String name, double cost, String name1, double cost1) {
        super(aboutCost, androidornot, name, cost);
        this.name = name1;
        this.cost = cost1;
    }
}
