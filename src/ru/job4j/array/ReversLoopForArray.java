package ru.job4j.array;

public class ReversLoopForArray {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7};
            for (int i = 0; i < numbers.length /*&& (i % 2 == 0)*/; i++) {
                if ((numbers.length - 1 - i) % 2 == 0) {
                    System.out.println("Текущий элемент массива начиная с последнего, с четными индексами: " + numbers[numbers.length - 1 - i]);
                }
            }
        }
}
