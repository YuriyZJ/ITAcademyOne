package Lesson25.T02;

/*
Создайте универсальный интерфейс с именем «Процессор» с методом с именем «процесс», который принимает параметр универсального типа и возвращает значение универсального типа.
Реализуйте этот интерфейс в классе и переопределите метод процесса для выполнения некоторой операции.
*/

public class Main {
    public static void main(String[] args) {
        StringReverser str = new StringReverser();
        System.out.println(str.process("Java"));

        StringReverserTwo str2 = new StringReverserTwo();
        System.out.println(str2.process(290080));
    }
}
