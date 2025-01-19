package Lesson05;
import java.util.Scanner;

public class Lesson05T02 {

/*    public class Lesson05T02{
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
    }*/

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double n;

        System.out.println ("Введите число");
        System.out.println ("> ");

        while (!sc.hasNextDouble()){
            sc.nextLine();// извлекли ошибочный ввод
            sc.nextInt();// извлекли ошибочный ввод
            System.out.println("Неверно введено число");
            System.out.println("Повторите попытук сново >");
        }
        n = sc.nextDouble();
        System.out.println("Good, go next level");
    }
}
