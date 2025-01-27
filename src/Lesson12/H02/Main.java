package Lesson12.H02;

/* 2. Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса. */

public class Main {
    public static void main(String[] args){
        Test2 test21 = new Test2();
        Test2 test22 = new Test2(2, "Helloy");

        System.out.println(test21.getX() + "/" + test21.getY());
        System.out.println(test22.getX() + "/" + test22.getY());
    }
}
