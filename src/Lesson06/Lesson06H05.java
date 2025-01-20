package Lesson06;

//5. С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.

public class Lesson06H05 {
    public static void main(String[] args){
        int i = 1;

        while(i <= 99){
            if (i % 2 == 1){
                System.out.println(i);
            }
            i++;
        }
    }
}
