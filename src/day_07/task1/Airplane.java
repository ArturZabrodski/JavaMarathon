package day_07.task1;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void fillUp(int inputFuel) {
        this.fuel += inputFuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer +
                ", год выпуска: " + year +
                ", длина: " + length +
                ", вес: " + weight +
                ", количество топлива в баке: " + fuel);
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Самолет " + airplane1.getProducer()
                    + " длиннее, чем самолет " + airplane2.getProducer());
        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println("Самолет " + airplane2.getProducer()
                    + " длиннее, чем самолет " + airplane1.getProducer());
        } else {
            System.out.println("Самолет " + airplane2.getProducer() + " и "
                    + airplane1.getProducer() + " одинаковые по длине");
        }
    }
}
