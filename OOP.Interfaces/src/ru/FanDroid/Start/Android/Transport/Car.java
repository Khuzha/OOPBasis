package ru.FanDroid.Start.Android.Transport;

public class Car implements Bip, EngineSounds {

    @Override
    public String tellingText() {
        System.out.println("Let`s go guys!");
        return null;
    }

    @Override
    public int getVolumeOfEngine() {
        System.out.println("I`m starting! GRRR");
        return 0;
    }

    @Override
    public void biiiip() {
        System.out.println("Clear the way!");
    }

    @Override
    public void go() {
        System.out.println("VUUU! Let`s go!");
    }
}
