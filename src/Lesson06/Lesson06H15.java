package Lesson06;

//15. Вычислить : 1+2+4+8+...+ 2 в 10 степени.

public class Lesson06H15 {
    public static void main(String[] args){
        double sum = 0;

        for (int i = 1; i <= 8; i = i*2){
            sum += i;
        }
        System.out.println(sum);
        double sumS = Math.pow(((sum * 2) + 10), 10);
        System.out.println(sumS);
    }
}
