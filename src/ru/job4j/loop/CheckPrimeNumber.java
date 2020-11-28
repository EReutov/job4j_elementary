package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 1; i < number; i++) {
            if ((number % i == 0) && (i != 1)) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
