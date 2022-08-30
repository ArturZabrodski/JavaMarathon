package day_07.task2;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player() {
        Random random = new Random();
        this.stamina = random.nextInt(11) + MAX_STAMINA - 10;
        countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (this.stamina > MIN_STAMINA) {
            this.stamina--;
            if (this.stamina == MIN_STAMINA) {
                countPlayers--;
            }
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

}
