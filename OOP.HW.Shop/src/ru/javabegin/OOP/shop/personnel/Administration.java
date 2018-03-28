package ru.javabegin.OOP.shop.personnel;

public class Administration {

    public static void main(String[] args) {

        Sellers form = new Sellers(/*"Pasha", 650, "Sell goods"*/);


        Sellers selname = new Sellers();
        selname.setName("nick");

        Sellers showSelName = new Sellers();
        showSelName.getName();

    }


    private String rights;
    private String duties;
    private int sallary;
    private String knowledges;
    public String name;

    public Administration(String rights, String duties, int sallary, String knowledges){
        this.rights = rights;
        this.duties = duties;
        this.sallary = sallary;
        this.knowledges = knowledges;
    }

    public void setKnowledges (String knowledges){
        this.knowledges = knowledges;
    }

    public int getSallary () {
        return sallary;
    }

    public void setSallary ( int sallary){
        this.sallary = sallary;
    }

    public String getRights () {
        return rights;
    }

    public void setRights (String rights){
        this.rights = rights;
    }

    public void setDuties (String duties){
        this.duties = duties;
    }


}