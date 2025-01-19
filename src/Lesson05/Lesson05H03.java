package Lesson05;

import java.util.Scanner;

//3. Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше3; если больше, то вывести слово «no».

public class Lesson05H03 {
    public static void main(String[] args){
        int a = 3;
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        if (y < a){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
