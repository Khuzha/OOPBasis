package ru.javabegin.OOP.inheritance.models;

public class Lacetti extends Chevrolet{

    public Lacetti(String logo, double force, int speed) {
        super(logo, force, speed);
    }

    public Lacetti(int speed) {
        super(speed);
    }

    public Lacetti(double force) {
        super(force);
    }

    public Lacetti(String logo) {
        super(logo);
    }
}
