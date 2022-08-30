package day_09.task1;

public class Teacher extends Human {
    private String nameStudy;

    public Teacher(String name, String nameStudy) {
        super(name);
        this.nameStudy = nameStudy;
    }

    public String getNameStudy() {
        return nameStudy;
    }

    public void setNameStudy(String nameStudy) {
        this.nameStudy = nameStudy;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }
}
