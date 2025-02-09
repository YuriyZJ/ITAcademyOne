package Lesson26.T02;

//9 1. Создайте два потока: один печатает четные числа, другой - нечетные. Исследуйте его работу.

public class Main {
    public static void main(String[] args) {
    EvenNumbers evenN = new EvenNumbers();
    Thread oddN = new Thread(new OddNumbers()); // оборачиваем в конструктор класса Thread тк мы класс объект реализуем интерфейс Runnable

    evenN.start();
    oddN.start();
    }
}
