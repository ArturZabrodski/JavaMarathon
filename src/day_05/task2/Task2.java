package day_05.task2;

/**
 * 2. Создать класс Мотоцикл (англ. Motorbike), с  полями “Год выпуска”, “Цвет”,
 * “Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
 * использовать). Придерживаться принципов инкапсуляции и использовать ключевое
 * слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
 * консоль.
 */

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2005,  "Black", "Suzuki");

        System.out.println(motorbike.getYear());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getModel());
    }
}
