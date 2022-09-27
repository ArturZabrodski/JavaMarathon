package day_14.task1;

/**
 * 1. Создать txt-файл в папке проекта.
 * Заполнить его десятью произвольными числами. Реализовать статический
 * метод printSumDigits(File file), который считает сумму всех чисел в этом
 * файле и выводит ее на экран. Вызвать данный метод в методе main().
 * Если файла не существует в папке проекта, в программе необходимо выбрасывать
 * исключение и выводить в консоль сообщение “Файл не найден”. Помимо этого, если
 * чисел в файле меньше или больше 10, необходимо выбрасывать исключение и
 * выводить в консоль сообщение “Некорректный входной файл”.
 */

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("day14_task1.txt");

        printSumDigits(creatingAndFillingInFile(file));
    }

    public static File creatingAndFillingInFile(File file) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (1 + (int) (Math.random() * 100));
        }

        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < 10; i++) {
                writer.write(Integer.toString(array[i]) + " ");  // переводим числа в строку
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return file;
    }

    public static void printSumDigits(File file) {

        try (Scanner scanner = new Scanner(file)) {
            int sum = 0;
            String line = scanner.nextLine();
            String[] arrayString = line.split(" ");

            if (arrayString.length != 10) {
                throw new IllegalArgumentException();
            }

            for (String s : arrayString) {
                sum += Integer.parseInt(s);
            }

            System.out.println(Arrays.toString(arrayString));
            System.out.println("Сумма = " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
