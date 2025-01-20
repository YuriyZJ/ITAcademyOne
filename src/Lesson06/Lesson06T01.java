package Lesson06;

// цикл for, все варианты

public class Lesson06T01 {
    public static void main(String[] args) {
        double a;
        double b;
        double h;
        double y;

        a = 2;
        b = 3.5;
        h = 0.1;

        System.out.println("---------------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
        System.out.println("---------------------------------");

        for (double x = a , s = 4 /*можно объявлять несколько переменных*/; x <= b /*ставить логические варажения*/; x = x + h, s++ /*использовать несколько операвторов*/) {
            y = x - Math.sin(x);
            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y); // рассказыватеся подробно что и для чего
        }
        System.out.println("---------------------------------");
    }
}

/*
Счетчик цикла изменять можно и в теле цикла, оставив выражение3 пустым.

int i = 0;
for(; i < 10; ) {
i = i + 2;
        }

Цикл for можно сделать ‘вечным’ оставив выражение 2 пустым
for( ; ; ) {
}

*/
