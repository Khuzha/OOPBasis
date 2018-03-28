package ru.javabegin.OOP.shop.personnel;

public class Sellers {

    private String name;
    public String uniform;
    private int sallary;
    private String duties;

/*
    public Sellers(String name, int sallary, String duties) {
        this.name = name;
        this.sallary = sallary;
        this.duties = duties;
    }
*/

    public String getName() {
        return name;
    }


    public int getSallary() {
        return sallary;
    }

    public void setSallary(int sallary) {
        this.sallary = sallary;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public void setName(String name) {
        this.name = name;
    }
}
