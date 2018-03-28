package ru.FanDroid.Start.Android;

public class Main {

    public static void main(String[] args) {

        int a = (int) ((Math.random() * 10));
        lolkek(a);
    }

    public static void lolkek(int a) {
        try {
            System.out.println(a / 0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Такого элемента индекса не существует");
        } catch (ArithmeticException e) {
            System.out.println("Произошла арифметическая ошибка. Например, деление на нуль");
        } catch (Exception e) {
            System.out.println("Неопознанная ошибка");
        }

    }
}
