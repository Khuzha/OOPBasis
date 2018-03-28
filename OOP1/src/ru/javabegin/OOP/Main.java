package ru.javabegin.OOP;

import objects.Car;

public class Main {

    public static void main(String[] args) {

    Car phantom = new Car();

    phantom.setName("Cruze");
    phantom.setColor("Black");
    phantom.setHeight(1.6);

        System.out.println("Название Вашей машины: " + phantom.getName() + ", ее цвет: " + phantom.getColor() + ", высота: " + phantom.getHeight());

    }
}