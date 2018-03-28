package ru.javabegin.OOP.shop.owners;

public class Shareholder {
    private float percent;
    private double prifit;
    public String name;
    public float percentOfShares;


    public Shareholder(float percentOfShares) {
        this.percentOfShares = percentOfShares;
    }

    public float getPercentOfShares() {
        return percent;
    }
}
