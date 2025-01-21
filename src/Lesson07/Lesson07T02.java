package Lesson07;

public class Lesson07T02 {
    public static void main(String[] args) {
        int x = 7;
        System.out.println("in main: x = " + x);
        method(x); // передалось значени, а не сама переменная
        System.out.println("in main: x = " + x);
    }

    public static void method(int x) {          //все переменные объявленные в данном методе остаются в нем,
        System.out.println(" in method: x = " + x);
        x++;
        System.out.println(" in method: x = " + x);
    }
}
