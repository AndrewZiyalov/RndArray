package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] a = new int[20];
        int maxNum = 0;
        int minNum = 0;

        System.out.println("Исходный массив:\n");
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(20 + 1) - 10;
            System.out.print(a[i] + " ");
        }

        for (int i : a) {
            maxNum = i > maxNum ? i : maxNum;
            minNum = i < minNum ? i : minNum;
        }

        for (int i = 0; i < a.length; i++) {
            maxNum = maxNum > a[i] && a[i] > 0 ? a[i] : maxNum;
            minNum = minNum < a[i] && a[i] < 0 ? a[i] : minNum;
        }
        System.out.println("\nМаксимальное отрицательное значение: " + maxNum);
        System.out.println("Минимальное положительное значение " + minNum);


        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] == minNum ? maxNum : a[i] == maxNum ? minNum : a[i];
        }

        System.out.println("Массив с замененными значениями: ");
        for (int i : a
        ) {
            System.out.print(i + " ");
        }

    }
}
