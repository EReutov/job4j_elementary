package ru.job4j.oop;

public class TrackerSFLL {
    private static TrackerSFLL instance;

    private TrackerSFLL() {
    }

    public static TrackerSFLL getInstance() {
        if (instance == null) {
           instance = new TrackerSFLL();
        }
        return instance;
    }
}
