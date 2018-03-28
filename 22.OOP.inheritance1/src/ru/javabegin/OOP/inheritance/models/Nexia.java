package ru.javabegin.OOP.inheritance.models;

public class Nexia extends Chevrolet {

    public Nexia(String logo, double force, int speed) {
        super(logo, force, speed);
    }

    public Nexia(double force) {
        super(force);
    }

    public Nexia(int speed) {
        super(speed);
    }

    public Nexia(String logo) {
        super(logo);
    }
}
