package day_02;

import java.util.Scanner;

/**
 * 3. Реализовать программу №2, используя цикл ?while?.
 */

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            a++;
            while (a < b) {
                if (a % 5 == 0 && a % 10 != 0) {
                    System.out.print(a + " ");
                }
                a++;
            }
        }
    }
}
