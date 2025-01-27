package Lesson12.H05M;

/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
*/

import java.util.Random;

public class Counter {
    Random random = new Random();
    int count = 10;
    int start = 0;

    public void current(){
        int countd = random.nextInt(0, 10);
        System.out.println(countd);
    }

    public void increase() {
        System.out.print("Increment: ");
        while (start <= count){
            System.out.print(start + ",");
            start++;
        }
        System.out.println();
    }

    public void decrease(){
        System.out.print("Decrement: ");
        for (int i = count; i > start; i--){
            System.out.print(count + ",");
        }
        System.out.println();
    }
}
