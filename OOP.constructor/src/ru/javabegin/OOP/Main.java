package ru.javabegin.OOP;

import ru.javabegin.OOP.objects.Phone;

public class Main {

    public static void main(String[] args) {
        
        Phone oneph = new Phone(8, 128, "OnePhone", "Black", "Superphone");

        System.out.println("oneph.getRam() = " + oneph.getRam());
        System.out.println("oneph.getRom() = " + oneph.getRom());
        System.out.println("oneph.getName() = " + oneph.getName());
        System.out.println("oneph.getColor() = " + oneph.getColor());
        System.out.println("oneph.getType() = " + oneph.getType());
        
    }
    
    }

