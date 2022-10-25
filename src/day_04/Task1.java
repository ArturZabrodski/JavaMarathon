package day_04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 1. С клавиатуры вводится число n - размер массива. Необходимо создать массив
 * указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
 * содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 * <p>
 * Пример:
 * Введено число 10. Сгенерирован следующий массив:
 * [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
 * <p>
 * Информация о массиве:
 * Длина массива: 10
 * Количество чисел больше 8: 1
 * Количество чисел равных 1: 0
 * Количество четных чисел: 6
 * Количество нечетных чисел: 4
 * Сумма всех элементов массива: 46
 */

public class Task1 {
    public static void main(String[] args) {
        int count_8 = 0;
        int count_1 = 0;
        int countDiv0 = 0;
        int countDiv1 = 0;
        int sumArray = 0;
        Random random = new Random();

        System.out.print("Размер массива = ");
        Scanner sc = new Scanner(System.in);
        int sizeArray = sc.nextInt();
        int[] array = new int[sizeArray];


        for (int i = 0; i < sizeArray; i++) {
//            array[i] = (int) (Math.random() * 11);
            array[i] = random.nextInt(11);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                count_8++;
            }
            if (array[i] == 1) {
                count_1++;
            }
            if (array[i] % 2 == 0) {
                countDiv0++;
            } else {
                countDiv1++;
            }
            sumArray += array[i];
        }


        System.out.println("Сгенерирован следующий массив: " + Arrays.toString(array));
        System.out.println("Длина массива = " + sizeArray);
        System.out.println("Количествo чисел больше 8 = " + count_8);
        System.out.println("Количествo чисел равных 1 = " + count_1);
        System.out.println("Количествo четных чисел = " + countDiv0);
        System.out.println("Количествo нечетных чисел = " + countDiv1);
        System.out.println("Сумма всех элементов массива = " + sumArray);
    }
}
