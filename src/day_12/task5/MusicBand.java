package day_12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public void addMembers(String firstName, String lastName, int age) {
        MusicArtist member = new MusicArtist(firstName, lastName, age);
        this.members.add(member);
    }

    public void deleteMembers(int index) {
        members.remove(index);
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        for (int i = 0; i < musicBand1.members.size(); i++) {
            musicBand2.getMembers().add(musicBand1.members.get(i));
        }
        musicBand1.members.clear();
    }

    public void printMembers() {
        System.out.println("Musicband: " + this.name);
        System.out.println(members);
    }

    @Override
    public String toString() {
        return "\nMusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }
}
