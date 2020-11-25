package ru.job4j.calculator;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        /* int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");
        */

        int in = 420;
        int expectedE = 6, expectedD = 7;
        int outE = rubleToEuro(in);
        int outD = rubleToDollar(in);
        boolean passedE = expectedE == outE;
        boolean passedD = expectedD == outD;
        System.out.println("420 rubles are 6 euro. Test result : " + passedE);
        System.out.println("420 rubles are 7 dollar. Test result : " + passedD);

    }
}
