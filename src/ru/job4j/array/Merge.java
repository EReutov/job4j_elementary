package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int a = 0;
        int b = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (a < left.length && left[a] <= right[b]) {
                rsl[i] = left[a];
                a++;
            } else {
                rsl[i] = right[b];
                b++;
            }
        }
        return rsl;
    }
}