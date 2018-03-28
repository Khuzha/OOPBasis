package ru.javabegin.OOP.shop.owners;

public class CEO {
    public String rights, duties, name;
    private float sallary;
    private String knowledges;

    public CEO(float sallary, String knowledges) {
        this.sallary = sallary;
        this.knowledges = knowledges;
    }

    public void setSallary(float sallary) {
        this.sallary = sallary;
    }

    public String getKnowledges() {
        return knowledges;
    }

    public void setKnowledges(String knowledges) {
        this.knowledges = knowledges;
    }
}
