package ru.job4j.io;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Matches {

    public static void main(String[] args) throws Exception {
        int matches = 11;
        Scanner count = new Scanner(System.in);
        System.out.println("Игра 11 спичек. Победит тот кто уменьшит кол-во спичек до нуля");
        boolean player = true;
        String player1 = "Первый игрок.";
        String player2 = "Второй игрок.";
        while (matches != 0) {
            System.out.println("\r" + (player ? player1 : player2) + " Введите от 1 до 3 спичек чтобы уменьшить кол-во спичек (Осталось " + matches + "):");
            int a = Integer.parseInt(count.nextLine());
            if  (a >= 1 && a <= 3) {
                if (matches - a >= 0) {
                    matches -= a;
                    player = !player;
                /*} else if (matches - a == 0) {
                    System.out.println((player ? player1 : player2) + " Вы победили!");
                    sleep(3000);
                    matches -= a;*/
                } else if (matches - a < 0) {
                    System.out.println("Введенное число первышает остаток!");
                    player = !player;
                }
            } else {
                System.out.println("Введено недопустимое число!");
                player = !player;
            }
        }
        System.out.println((player ? player1 : player2) + " Вы победили!");
        sleep(3000);
    }

}
