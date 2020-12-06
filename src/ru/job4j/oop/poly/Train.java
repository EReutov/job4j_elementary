package ru.job4j.oop.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Едет и " + makeStop());
    }

    @Override
    public String makeStop() {
        return "прибывает на перон.";
    }
}
