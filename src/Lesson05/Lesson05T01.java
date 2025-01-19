package Lesson05;
import java.util.Scanner;

public class Lesson05T01 {
}

/*
public class Lesson05T01 {
    public static void main(String[] args) {
        double a = 8, b = 20;
        double x = 9, y = 9, z = 20;

        if (a > x) {
            if (b > y) {
                System.out.println("Проидет.");
            }
        } else if (a > y) {
            if (b > x) {
                System.out.println("Проидет.");
            }
        } else if (a > x) {
            if (b > z) {
                System.out.println("Проидет.");
            }
        } else if (a > z) {
            if (b > x) {
                System.out.println("Проидет.");
            }
        } else if ((a > y) & (b > z)) {
            System.out.println("Проидет.");
        } else if ((a > z) & (b > y)) {
            System.out.println("Пройдет.");
        } else {
            System.out.println("Не пройдет.");
        }
    }
}

public class Lesson05T01{
    public static void main(String[] args){
        Scanner scanner;
        double x;

        scanner = new Scanner (System.in);
        System.out.println("> ");

        x = scanner.nextDouble();

        System.out.println("x = " + x);
    }
}

public class Lesson05T01{
    public static void main (String[] args){
        Scanner scanner;
        String st;

        System.out.println("> ");
        scanner = new Scanner (System.in);
        st = scanner.nextLine();

        System.out.println("st = " + st);
    }
}

public class Lesson05T01{
    public static void main(String[] args){
        Scanner scanner;
        int st;

        scanner = new Scanner(System.in);

        st = scanner.nextInt();
        System.out.println("st = " + st);

        st = scanner.nextInt();
        System.out.println("st = " + st);

        st = scanner.nextInt();
        System.out.println("st = " + st);

        st = scanner.nextInt();
        System.out.println("st = " + st);
    }
}

public class Lesson05T01{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println ("Введите число");
        System.out.println ("> ");

        while (!sc.hasNextInt()){
            sc.nextLine();// извлекли ошибочный ввод
            System.out.println("Неверно введено число");
            System.out.println("Повторите попытук сново >");
        }
        n = sc.nextInt();
        System.out.println("Good, go next level");
    }
}

public class Lesson05T01{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double n;

        System.out.println ("Введите число");
        System.out.println ("> ");

        while (!sc.hasNextDouble()){
            sc.nextLine();// извлекли ошибочный ввод
            System.out.println("Неверно введено число");
            System.out.println("Повторите попытук сново >");
        }
        n = sc.nextDouble();
        System.out.println("Good, go next level");
    }
}
*/