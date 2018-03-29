package ru.FanDroid.Start.Android.Hear;

public class Cat implements Sounds { //в жтом классе обязательна реализация или хотя бы объявление методов и конструкторов суперкласса с помощью @Override
    @Override //но можно и не реализовывать все методы суперкласса, а лишь некоторые. Но для этого, данный класс должен быть объявлен абстрактным
    public void checkTurnedOn() {

    }

    @Override
    public void makePic() {
        System.out.println("Mew!");
    }
}
