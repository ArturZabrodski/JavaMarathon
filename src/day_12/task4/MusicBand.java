package day_12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<Members> members;

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

    public List<Members> getMembers() {
        return members;
    }

    public void setMembers(List<Members> members) {
        this.members = members;
    }

    public void addMembers(String firstName, String lastName) {
        Members member = new Members(firstName, lastName);
        this.members.add(member);
    }

    public void deleteMembers(int index) {
        members.remove(index);
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        for (int i = musicBand1.members.size() - 1; i >= 0; i--) {
            musicBand2.addMembers(musicBand1.members.get(i).getFirstName(), musicBand1.members.get(i).getLastName());
            musicBand1.deleteMembers(i);
        }
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
