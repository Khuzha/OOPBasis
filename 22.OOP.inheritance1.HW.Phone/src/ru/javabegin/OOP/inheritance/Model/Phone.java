package ru.javabegin.OOP.inheritance.Model;

public class Phone extends Series {

    private String name;
    private String series;
    private double cost;
    private String audithory;
    private int amountOfSales;
    private String counrty;

    public Phone(double aboutCost, boolean androidornot, String name, double cost, String name1, double cost1, String name2, String series, double cost2, String audithory, int amountOfSales, String counrty) {
        super(aboutCost, androidornot, name, cost, name1, cost1);
        this.name = name2;
        this.series = series;
        this.cost = cost2;
        this.audithory = audithory;
        this.amountOfSales = amountOfSales;
        this.counrty = counrty;
    }
}
