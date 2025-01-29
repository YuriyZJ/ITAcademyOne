package Lesson12.H03;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Group group = new Group();

        group.add(new Student (1, "Сидоров", "А.Б.", 10208110, new int[] {5, 6, 7, 5, 8}));
        group.add(new Student (2, "Петров", "В.Г.", 10208110, new int[] {5, 6, 9, 5, 8}));
        group.add(new Student (3, "Иванов", "Д.Е.", 10208110, new int[] {5, 6, 4, 5, 8}));
        group.add(new Student (4, "Попов", "Ж.З.", 10208110, new int[] {5, 9, 7, 5, 8}));
        group.add(new Student (5, "Титов", "К.Л.", 10208110, new int[] {5, 8, 7, 4, 8}));
        group.add(new Student(6, "Кузнецов", "М.Н.", 10208110, new int[]{9, 10, 10, 9, 10}));
        group.add(new Student(7, "Васильев", "О.П.", 10208110, new int[]{6, 7, 5, 9, 10}));
        group.add(new Student(8, "Смирнов", "Р.С.", 10208110, new int[]{10, 10, 10, 10, 10}));
        group.add(new Student(9, "Морозов", "Т.У.", 10208110, new int[]{9, 9, 9, 9, 9}));
        group.add(new Student(10, "Фёдоров", "Ф.Х.", 10208110, new int[]{8, 9, 10, 9, 8}));


        group.print();

        group.findTopStudents();
    }
}
