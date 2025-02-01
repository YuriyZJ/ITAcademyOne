package Lesson12.H03;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private int id;
    private String lastName;
    private String initials;
    private int groupNumber;
    private int[] progress;

    public Student(int id, String lastName, String initials, int groupNumber, int[] progress){
        this.id = id;
        this.lastName = lastName;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.progress = progress;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getProgress() {
        return progress;
    }

    public void setProgress(int[] progress) {
        this.progress = progress;
    }

    // Метод, который проверяет, все ли оценки 9 или 10
    public boolean hasOnlyHighGrades() {
        for (int grade : progress) {
            if (grade < 9) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && groupNumber == student.groupNumber && Objects.equals(lastName, student.lastName) && Objects.equals(initials, student.initials) && Objects.deepEquals(progress, student.progress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, initials, groupNumber, Arrays.hashCode(progress));
    }
}
