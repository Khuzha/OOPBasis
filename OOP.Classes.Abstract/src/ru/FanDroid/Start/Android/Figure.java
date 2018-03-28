package ru.FanDroid.Start.Android;

public abstract class Figure {

    double height, width, thickness, area, volume; //свойства в абстрактных классах объявляются, но им не присваиваются значения

    public Figure(double height, double width, double thickness, double area, double volume) {
        this.height = height;
        this.width = width;
        this.thickness = thickness;
        this.area = area;
        this.volume = volume;
    }

    abstract int lolkek(); //абстрактный метод не имеет тела - т.е. реализации

}



