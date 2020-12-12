package ru.job4j.oop;

public class TrackerSFFEL {
    private static final TrackerSFFEL INSTANCE = new TrackerSFFEL();

    private TrackerSFFEL() {
    }

    public static TrackerSFFEL getInstance() {
        return INSTANCE;
    }
}
