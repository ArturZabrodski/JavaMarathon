package day_12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year
 * (название музыкальной группы и год основания). Создать 10 или более экземпляров
 * класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
 * которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать
 * список. Создать статический метод в классе Task3:
 * public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
 * Этот метод принимает список групп в качестве аргумента и возвращает новый список,
 * состоящий из групп, основанных после 2000 года. Вызвать метод
 * groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке
 * из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными
 * после 2000 года).
 */

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Depeche Mode", 1980);
        MusicBand musicBand2 = new MusicBand("Queen ", 1970);
        MusicBand musicBand3 = new MusicBand("The Smiths", 1982);
        MusicBand musicBand4 = new MusicBand("Guns N' Roses", 1980);
        MusicBand musicBand5 = new MusicBand("Sting", 1971);
        MusicBand musicBand6 = new MusicBand("Nirvana", 1967);
        MusicBand musicBand7 = new MusicBand("Bon Jovi", 1983);
        MusicBand musicBand8 = new MusicBand("Arctic Monkeys", 2002);
        MusicBand musicBand9 = new MusicBand("Fall Out Boy", 2001);
        MusicBand musicBand10 = new MusicBand("OneRepublic", 2002);

        List<MusicBand> musicBandList = new ArrayList<>();

        musicBandList.add(musicBand1);
        musicBandList.add(musicBand2);
        musicBandList.add(musicBand3);
        musicBandList.add(musicBand4);
        musicBandList.add(musicBand5);
        musicBandList.add(musicBand6);
        musicBandList.add(musicBand7);
        musicBandList.add(musicBand8);
        musicBandList.add(musicBand9);
        musicBandList.add(musicBand10);

        System.out.println(musicBandList);

        Collections.shuffle(musicBandList);

        List<MusicBand> musicBandList2 = groupsAfter2000(musicBandList);

        System.out.println(musicBandList);
        System.out.println(musicBandList2);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBandList) {
        List<MusicBand> musicBandList2 = new ArrayList<>();

        for (MusicBand element : musicBandList) {
            if (element.getYear() > 2000) {
                musicBandList2.add(element);
            }
        }
        return musicBandList2;
    }
}
