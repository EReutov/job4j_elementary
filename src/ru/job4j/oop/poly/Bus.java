package ru.job4j.oop.poly;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Едет и " + makeStop());
    }

    @Override
    public String makeStop() {
        return "останавливается на остановке.";
    }
}
