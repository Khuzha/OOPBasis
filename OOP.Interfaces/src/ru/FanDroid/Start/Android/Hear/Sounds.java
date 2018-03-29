package ru.FanDroid.Start.Android.Hear;

public interface Sounds {

    public void checkTurnedOn();

    default public void makePic(){
        System.out.println("Grrrrr...");
    }

}
