package Lesson12.H03;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> student = new ArrayList<>();

    public Group(){
    }

    public Group(List<Student> student){
        this.student = student;
    }

    public boolean add(Student st) {
        return student.add(st);
    }

    // Новый метод для поиска студентов, у которых все оценки 9 или 10
    public void findTopStudents() {
        System.out.println("Студенты с оценками только 9 или 10:");
        for (Student st : student) {
            if (st.hasOnlyHighGrades()) {
                System.out.println(st.getLastName() + " (группа " + st.getGroupNumber() + ")");
            }
        }
    }

    public void print(){
        System.out.println("--------------------List student--------------------");
        for(int i = 0; i < student.size(); i++){
            Student st = student.get(i);
            System.out.println(st.getId() + "/" + st.getLastName() + "/" + st.getInitials()  + "/" + st.getGroupNumber());
            for (int grade : st.getProgress()) {
                System.out.print(grade + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------List student--------------------");
    }
}
