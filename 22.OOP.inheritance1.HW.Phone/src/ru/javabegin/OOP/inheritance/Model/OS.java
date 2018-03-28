package ru.javabegin.OOP.inheritance.Model;

import ru.javabegin.OOP.inheritance.Main;

public class OS extends Main{
    private double aboutCost;
    private boolean Androidornot;

    public OS(double aboutCost, boolean androidornot) {
        this.aboutCost = aboutCost;
        Androidornot = androidornot;
    }

    public OS(double aboutCost) {
        this.aboutCost = aboutCost;
    }

    public OS(boolean androidornot) {
        Androidornot = androidornot;
    }

}
