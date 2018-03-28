package ru.javabegin.OOP.objects;

public class Phone {

    private int ram = 6;
    private int rom = 64;
    private  String name = "Mi A1", color = "Black", type = "4G Smartphone";

    public Phone() {
    }

    public Phone(int ram, int rom, String name, String color, String type) {
        this.ram = ram;
        this.setRom(rom);
        this.name = name;
        this.color = color;
        this.type = type;
    }



    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }
}
