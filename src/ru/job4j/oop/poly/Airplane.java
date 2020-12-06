package ru.job4j.oop.poly;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Летит и " + makeStop());
    }

    @Override
    public String makeStop() {
        return "приземляется в аэропорту.";
    }
}
