package ru.job4j.oop;

public class TrackerPSFCLL {
    private TrackerPSFCLL() {
    }

    public static TrackerPSFCLL getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerPSFCLL INSTANCE = new TrackerPSFCLL();
    }
}
