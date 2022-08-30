package day_05.task1;

/**
 * 1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
 * задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 */

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setModel("Seat Leon");
        car.setColor("Grey");
        car.setYear(2002);

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYear());
    }
}
