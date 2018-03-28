package ru.javabegin.OOP.shop.personnel;

public class Security {

    private int sallary;
    private String name;
    private String duties;
    private String subjects;


    public Security(int sallary, String name, String duties, String subjects) {
        this.sallary = sallary;
        this.name = name;
        this.duties = duties;
        this.subjects = subjects;
    }

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

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }
}
