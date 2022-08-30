package day_04;

import java.util.Arrays;
import java.util.Random;

/**
 * 4. Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
 * максимальной суммой выведите значение суммы и индекс первого элемента тройки.
 * <p>
 * Пример:
 * Для простоты пример показан на массиве размера 10
 * <p>
 * [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
 * <p>
 * Тройка с максимальной суммой: [2789, 4, 8742]
 * <p>
 * Вывод в консоль:
 * 11535
 * 5
 * Пояснение.
 * Первое число - сумма тройки [2789, 4, 8742].
 * Второе число - индекс первого элемента тройки, то есть индекс числа 2789.
 */

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sumMax = 0;
        int index = 0;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }

        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > sumMax) {
                sumMax = sum;
                index = i;
            }
        }

        System.out.println("сгенерированный массив: " + Arrays.toString(array));
        System.out.println("сумма тройки = " + sumMax);
        System.out.println("индекс первого элемента тройки = " + index);
    }
}
