package Lesson08;

import java.util.Scanner;

public class Lesson08T01 {
    public static void main(String[] args){
        double x, y;
        double sum;

        x = inputDoubleFromConsole("Input first number:");
        y = inputDoubleFromConsole("Input second number:");

        sum = additionaly(x, y);

        simplePrint(x, y, sum, '+');
        hardPrint(x, y, sum, '+');
    }

    public static double inputDoubleFromConsole(String message){
        double value;
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
            while(!sc.hasNextDouble()){
                sc.nextLine();
                System.out.println("Not a number. " + message);
            }
            value = sc.nextDouble();
            return value;
    }

    public static double additionaly(double x, double y){
        double sum;
        sum = x + y;
        return sum;
    }

    public static void simplePrint(double x, double y, double sum, char plus){
        System.out.println( x + " " + plus + " " + y +  " = " + sum);
    }

    public static void hardPrint(double x, double y, double sum, char plus){
        System.out.printf("[%.2f] %c [%.2f] = [%.2f]", x, plus, y, sum);
    }
}
