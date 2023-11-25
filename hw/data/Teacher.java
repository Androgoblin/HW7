package data;

import java.util.Random;

public class Teacher extends User {

    private int teacherId;

    public Teacher(String firstName, String secondName, String lastName, int teacherId) {
        super(firstName, secondName, lastName);
        Random random = new Random();
        this.teacherId = random.nextInt(1000);
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher: " +
                "Имя: " + super.getFirstName() +
                ", Отчество: " + super.getSecondName() +
                ", Фамилия: " + super.getLastName() +
                ", Идентификатор: " + teacherId;
    }
}
    

