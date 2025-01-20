package Lesson06;

//9. Найти сумму квадратов первых ста чисел.

public class Lesson06H09 {
    public static void main(String[] args){
        double sum = 0;
        int a = 1;

        while(a <= 100){
            sum = sum + Math.pow(a , 2);
            a++;
        }
        System.out.println(sum);
    }
}
