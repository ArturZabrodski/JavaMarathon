package day_12.task5;

import java.util.ArrayList;
import java.util.List;

/**
 * 5. Выполнять в подпапке task5 в day12*
 * Скопировать MusicBand из прошлого задания и доработать - теперь у участника
 * музыкальной группы есть не только имя, но и возраст. Соответственно, теперь под
 * участником понимается не строка, а объект класса MusicArtist. Необходимо
 * реализовать класс MusicArtist и доработать класс MusicBand (создать копию
 * класса) таким образом, чтобы участники были - объекты класса  MusicArtist. После
 * этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и
 * проверить состав групп после слияния. Методы для слияния и для вывода участников
 * в консоль необходимо тоже переработать, чтобы они работали с объектами класса
 * MusicArtist.
 */

public class Task5 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Guns N' Roses", 1980);
        MusicBand musicBand2 = new MusicBand("Sting", 1971);
        MusicBand musicBand3 = new MusicBand("Nirvana", 1967);

        musicBand1.addMembers("A", "B", 21);      // del
        musicBand1.addMembers("AA", "BB", 25);
        musicBand1.addMembers("AAA", "BBB", 30);

        musicBand2.addMembers("B", "C", 25);
        musicBand2.addMembers("BB", "CC", 29);    // del
        musicBand2.addMembers("BBB", "CCC", 34);

        musicBand3.addMembers("C", "A", 54);
        musicBand3.addMembers("CC", "AA", 43);
        musicBand3.addMembers("CCC", "AAA", 46);  // del

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
