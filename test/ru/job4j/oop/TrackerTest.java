package ru.job4j.oop;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrackerTest {

    @Test
    public void whenEnum() {
        TrackerEnum result = TrackerEnum.INSTANCE;
        assertSame(result, TrackerEnum.INSTANCE);
    }

    @Test
    public void whenTrackerSFLL() {
        TrackerSFLL result = TrackerSFLL.getInstance();
        assertSame(result, TrackerSFLL.getInstance());
    }

    @Test
    public void whenTrackerSFFEL() {
        TrackerSFFEL result = TrackerSFFEL.getInstance();
        assertSame(result, TrackerSFFEL.getInstance());
    }

    @Test
    public void whenTrackerPSFCLL() {
        TrackerPSFCLL result = TrackerPSFCLL.getInstance();
        TrackerPSFCLL wtf = TrackerPSFCLL.getInstance();
        assertSame(result, wtf);
    }

}