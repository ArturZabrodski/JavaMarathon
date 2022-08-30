package day_09.task1;

public class Student extends Human {
    private String groupNumber;

    public Student(String name, String numberGroup) {
        super(name);
        this.groupNumber = numberGroup;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());
    }

}
