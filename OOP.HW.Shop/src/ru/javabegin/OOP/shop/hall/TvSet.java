package ru.javabegin.OOP.shop.hall;

public class TvSet {
    public int amountOfChannels, workTime;
    private float price;
    public String channels;


    public TvSet(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
