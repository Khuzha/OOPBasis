package ru.javabegin.OOP.shop.hall;

public class Customer {

    public String rights, duties, knowledge;
    private float moneyAmount;
    private String name;


    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
