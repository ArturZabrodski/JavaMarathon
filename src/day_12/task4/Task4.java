package day_12.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. Выполнять в подпапке task4 в day12
 * Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в
 * группу можно было добавлять и удалять участников.
 * Под участником понимается строка (String) с именем и фамилией.
 * Реализовать статический метод слияния групп (в классе MusicBand),
 * т.е. все участники группы А переходят в группу B. Название
 * метода: transferMembers. Этот метод принимает в качестве аргументов два
 * экземпляра класса MusicBand.
 * Реализовать метод printMembers (в классе MusicBand),
 * выводящий список участников в консоль. Проверить состав групп после слияния.
 */

public class Task4 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Guns N' Roses", 1980);
        MusicBand musicBand2 = new MusicBand("Sting", 1971);
        MusicBand musicBand3 = new MusicBand("Nirvana", 1967);

        musicBand1.addMembers("A", "B");      // del
        musicBand1.addMembers("AA", "BB");
        musicBand1.addMembers("AAA", "BBB");

        musicBand2.addMembers("C", "D");
        musicBand2.addMembers("CC", "DD");    // del
        musicBand2.addMembers("CCC", "DDD");

        musicBand3.addMembers("E", "F");
        musicBand3.addMembers("EE", "FF");
        musicBand3.addMembers("EEE", "FFF");  // del

        musicBand1.deleteMembers(0);
        musicBand2.deleteMembers(1);
        musicBand3.deleteMembers(2);

        System.out.println(musicBand1);
        System.out.println(musicBand2);
        System.out.println(musicBand3);

        System.out.println("___________________");

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
