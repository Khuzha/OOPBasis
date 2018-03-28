package ru.javabegin.OOP.inheritance.models;

import ru.javabegin.OOP.inheritance.Main;

public class Chevrolet extends Main {

    private String logo;
    private double force;
    private int speed;


    public Chevrolet(String logo, double force, int speed) {
        this.logo = logo;
        this.force = force;
        this.speed = speed;
    }

    public Chevrolet(String logo) {
        this.logo = logo;
    }

    public Chevrolet(double force) {
        this.force = force;
    }

    public Chevrolet(int speed) {
        this.speed = speed;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public double getForce() {
        return force;
    }

    public void setForce(double force) {
        this.force = force;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
