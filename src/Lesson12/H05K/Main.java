package Lesson12.H05K;

/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
*/

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter1 = new Counter(3, 10, 5);

        counter.getCounter();
        counter.increase();
        counter.decrease();

        counter1.getCounter();
        counter1.increase();
        counter1.decrease();

        System.out.println(counter.getCounter() + "/" + counter1.getCounter());
        System.out.println(counter.increase() + "/" + counter1.increase());
        System.out.println(counter.decrease() + "/" + counter1.decrease());

    }

}
