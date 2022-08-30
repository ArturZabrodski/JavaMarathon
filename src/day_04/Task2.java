package day_04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * 2. Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000.
 * Затем, используя циклы for each вывести:
 * -   наибольший элемент массива
 * -   наименьший элемент массива
 * -   количество элементов массива, оканчивающихся на 0
 * -   сумму элементов массива, оканчивающихся на 0
 * <p>
 * Использовать сортировку запрещено.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int minArray;
        int maxArray;
        int countArray0 = 0;
        int sumArray0 = 0;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }

        minArray = array[0];
        maxArray = array[0];

        System.out.println(Arrays.toString(array));

        for (int element : array) {
            if (element < minArray) {
                minArray = element;
            }
            if (element > maxArray) {
                maxArray = element;
            }
            if (element % 10 == 0) {
                countArray0++;
                sumArray0 += element;
            }
        }

        System.out.println("наибольший элемент массива = " + maxArray);
        System.out.println("наименьший элемент массива = " + minArray);
        System.out.println("количество элементов массива, оканчивающихся на 0 = " + countArray0);
        System.out.println("сумма элементов массива, оканчивающихся на 0 = " + sumArray0);
    }
}
