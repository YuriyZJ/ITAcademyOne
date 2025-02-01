package Lesson12.H03;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> student = new ArrayList<>(); //создаёт список студентов, который можно заполнять объектами класса Student.

    public Group(){
    }

    public Group(List<Student> student){ // конструктор используется при создании объекта класса Group. Он позволяет инициализировать группу сразу списком студентов.
        this.student = student;
    }


    //Student — это тип параметра, который означает, что в метод можно передать объект класса Student. st — это имя переменной, которое будет использоваться внутри метода для работы с переданным объектом.
    public boolean add(Student st) { //метод добавляет одного конкретного студента в список. Он нужен, если мы создаём Group, а затем добавляем студентов по одному.
        return student.add(st); //именно boolean позволяет проверить, добавился ли студент в группу. Если ты уверен, что добавление всегда проходит успешно, можно оставить void, но использование boolean даёт гибкость в будущем.
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
