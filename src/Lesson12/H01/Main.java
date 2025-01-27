package Lesson12.H01;

//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
//Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.

public class Main {
    public static void main(String[] args){
        Test1 test = new Test1();

        test.print();

        test.xRef(100);
        test.yRef(1);

        test.print();

        System.out.println(test.max());
        System.out.println(test.summ());
    }

}

