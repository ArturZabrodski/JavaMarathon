package day_03;

import java.util.Scanner;

/**
 * 1. Реализовать программу, которая в консоль выводит название страны, принимая на
 * вход название города. Программа должна работать до тех пор, пока не будет введено
 * слово “Stop”.
 * Реализовать, используя следующие данные:
 * Москва, Владивосток, Ростов - Россия
 * Рим, Милан, Турин - Италия
 * Ливерпуль, Манчестер, Лондон - Англия
 * Берлин, Мюнхен, Кёльн - Германия
 * <p>
 * При вводе любого другого города, вывести сообщение “Неизвестная страна”.
 * <p>
 * Пример:
 * Милан - ваш ввод в консоль
 * Италия - ответ программы
 * Дублин - ваш ввод в консоль
 * Неизвестная страна - ответ программы
 * Stop - ваш ввод в консоль
 * программа завершила работу
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Введите название города: ");
            input = sc.nextLine();

            if (input.equals("Stop")) {
                System.out.println("Программа завершила работу");
                break;
            }

            switch (input) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}
