package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first >= second) {
            if (first >= third) {
                return first;
            } else {
                return third;
            }
        } else {
            result = second;
            if (result >= third) {
                return result;
            } else {
                return third;
            }
        }
    }
}
