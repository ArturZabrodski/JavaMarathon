package day_06.task1;

/**
 * В классах Автомобиль и Мотоцикл реализовать два метода:
 * info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 * yearDifference() - принимает на вход число (год), и возвращает разницу между
 * переданным годом и годом выпуска транспортного средства
 */

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setModel("Seat Leon");
        car.setColor("Grey");
        car.setYear(2002);

        Motorbike motorbike = new Motorbike(2005, "Black", "Suzuki");

        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(1900));
        System.out.println(motorbike.yearDifference(2022));
    }
}
