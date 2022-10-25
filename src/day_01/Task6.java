package day_01;

import java.util.Scanner;

/**
 * Введите цифру и выведите для нее тадицу умножения:
 * 1 x k = ...
 * 2 x k = ...
 * ...
 * 9 x k = ...
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("k = ");
        int k = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(i + " x " + k + " = " + i * k);
        }
    }
}
