package Lesson06;

//13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.

public class Lesson06H13 {
    public static void main(String[] args){
        double h = 0.5;
        double a = -5; // начало отрезка
        double b = 5; // конец отрезка

        for (double i = a; i <= b; i += h){
            double y = 5 - (Math.pow(i,2))/2;
            System.out.printf("%.2f%n", y);
        }
    }
}
