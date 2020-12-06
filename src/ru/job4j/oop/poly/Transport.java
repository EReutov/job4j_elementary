package ru.job4j.oop.poly;

public class Transport {

    public static void main(String[] args) {
        Vehicle[] vehicles = {new Bus(), new Train(), new Airplane()};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
