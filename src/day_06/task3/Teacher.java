package day_06.task3;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // оценивание студента
    public void evaluate(Student student) {
        Random random = new Random();
        int ball = random.nextInt(4) + 2;
        String result = null;

        switch (ball) {
            case 5:
                result = "отлично";
                break;
            case 4:
                result = "хорошо";
                break;
            case 3:
                result = "удовлетворительно";
                break;
            case 2:
                result = "неудовлетворительно";
                break;
        }

        System.out.println("Преподаватель " + this.name +
                " оценил студента с именем " + student.getName() +
                " по предмету " + this.subject +
                " на оценку " + result + ".");
    }
}
