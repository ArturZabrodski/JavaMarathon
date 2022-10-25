package day_04;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

/**
 * 3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
 * матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
 * В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
 * строк несколько, вывести индекс последней из них.
 * Пример сгенерированной матрицы (для простоты m=3, n=5):
 * <p>
 * 3 2 1 5 7  // сумма - 18
 * 1 2 5 6 2  // сумма - 16
 * 3 4 9 6 4  // сумма - 26
 * <p>
 * Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
 */

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int[][] array = new int[m][n];
        Random random = new Random();
        int sumStrMax = 0;
        int indexStr = 0;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(51);
            }
        }

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sumStrMax < sum) {
                sumStrMax = sum;
                indexStr = i;
            }
        }

        System.out.println("сгенерированная матрица: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("индекс строки, сумма чисел в которой максимальна = " + indexStr);
    }
}
