package ru.FanDroid.Start.Android;

public class Cube extends Figure{

    public Cube(double height, double width, double thickness, double area, double volume) { //не забываем обязательное объявление конструкторов суперкласса
        super(height, width, thickness, area, volume);
    }

    @Override //тут нужно либо реализовать все абстрактные методы абстрактного суперкласса, либо объявить этот класс абстрактным
    int lolkek() {
        return 0;
    }
}
