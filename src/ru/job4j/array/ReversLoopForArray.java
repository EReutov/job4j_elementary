package ru.job4j.array;

public class ReversLoopForArray {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7};
            for (int i = numbers.length - 1; i >= 0 /*&& (i % 2 == 0)*/; i--) {
                if (i % 2 == 0) {
                    System.out.println("Текущий элемент массива начиная с последнего, с четными индексами: " + numbers[i]);
                }
            }
        }
}
