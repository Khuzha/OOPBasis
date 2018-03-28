package ru.javabegin.OOP.shop.hall;

public class Goods {

    public float price;
    private int amount;
    public String name;
    public String category;
    private float percentOfProfitability;
    public String location, manufactuer;


    public Goods(int amount, float percentOfProfitability) {
        this.amount = amount;
        this.percentOfProfitability = percentOfProfitability;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPercentOfProfitability() {
        return percentOfProfitability;
    }

    public void setPercentOfProfitability(float percentOfProfitability) {
        this.percentOfProfitability = percentOfProfitability;
    }
}
