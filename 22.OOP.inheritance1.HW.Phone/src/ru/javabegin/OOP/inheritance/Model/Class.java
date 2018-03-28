package ru.javabegin.OOP.inheritance.Model;

public class Class extends OS {
    private String name;
    private double cost;

    public Class(double aboutCost, boolean androidornot, String name, double cost) {
        super(aboutCost, androidornot);
        this.name = name;
        this.cost = cost;
    }
}
