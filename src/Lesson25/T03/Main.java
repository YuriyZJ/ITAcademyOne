package Lesson25.T03;


/*
Создать программу на Java, демонстрирующую использование подстановочных знаков с дженериками.
Создайте метод, который принимает список чисел (которые могут иметь тип Integer, Double, Float и т. д.) и вычисляет сумму этих чисел.
Для этого используйте класс Number в качестве границы для подстановочного знака.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static double sumNumbers(List<? extends Number> list){
        double sum = 0;
        for(Number n: list){
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Double> listDouble = new ArrayList<>();
        listDouble.add(123.2);
        listDouble.add(11.3);
        listDouble.add(1.5);
        System.out.println(sumNumbers(listDouble));

        List<Integer> listInteger = Arrays.asList(1,2,3,4,5);
        System.out.println(sumNumbers(listInteger));
    }
}


