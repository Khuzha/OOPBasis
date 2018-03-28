package ru.javabegin.OOP.shop.hall;

public class CashDesk {

    public String name, lastName;
    private float sallary;
    private String knowledge;
    public String duties;


    public CashDesk(float sallary, String knowledge) {
        this.sallary = sallary;
        this.knowledge = knowledge;
    }

    public void setSallary(float sallary) {
        this.sallary = sallary;
    }

    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge;
    }
}
