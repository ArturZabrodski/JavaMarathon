package day_12.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в
 * консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
 * из списка. Распечатать список.
 */

public class Task1 {
    public static void main(String[] args) {
        List<String> listAuto = new ArrayList<>();

        listAuto.add("Audi");
        listAuto.add("BMW");
        listAuto.add("Mercedes");
        listAuto.add("Infinity");
        listAuto.add("Chrysler");

        System.out.println(listAuto);

        listAuto.add(2, "Mazda");

        listAuto.remove(0);

        System.out.println(listAuto);
    }
}
