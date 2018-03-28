package ru.javabegin.OOP.shop.personnel;

public class Banker {

    private double incomeOfShop;
    private double profitOfShop;
    private String name;
    public String nameOfBank;
    public String rights;
    public float comissionPercent;


    public Banker(double incomeOfShop, double profitOfShop, String name) {
        this.incomeOfShop = incomeOfShop;
        this.profitOfShop = profitOfShop;
        this.name = name;
    }

    public void setIncomeOfShop(double incomeOfShop) {
        this.incomeOfShop = incomeOfShop;
    }

    public void setProfitOfShop(double profitOfShop) {
        this.profitOfShop = profitOfShop;
    }

    public String getName() {
        return name;
    }

}
