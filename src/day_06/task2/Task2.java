package day_06.task2;

/**
 * 2. Создать класс Самолет (Airplane) с полями:
 * -    producer (изготовитель)
 * -    year (год выпуска)
 * -    length (длина)
 * -    weight (вес)
 * -    fuel (количество топлива в баке) + геттер для этого поля
 * <p>
 * Создать конструктор в классе Самолет, принимающий в качестве аргументов значения
 * четырех полей класса (значение поля “количество топлива в баке” установить равным 0).
 * В конструкторе для передачи полям значений использовать ключевое слово this.
 * Помимо этого, в классе необходимо реализовать метод info(), который выводит
 * сообщение в следующем формате:
 * “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
 * Также, необходимо реализовать метод fillUp(), который в качестве аргумента
 * принимает число и заправляет топливный бак самолета на это значение.
 * Создать новый объект класса Самолет с произвольными данными.
 * Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp() два
 * раза, передав разные значения. Вызвать метод info().
 */

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2022, 100, 150000);

        airplane.setYear(2010);
        airplane.setLength(120);
        airplane.fillUp(3000);
        airplane.fillUp(500);
        airplane.info();
    }
}
