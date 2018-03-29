package ru.FanDroid.Start.Android.Transport;

public interface EngineSounds {

    public int getVolumeOfEngine();
    default public void go(){
        System.out.println("VVVVUUUUUUU");
    };

}
