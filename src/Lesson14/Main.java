package Lesson14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        for (int i = 0; i < list.size(); i++){
            System.out.println(i + " - " + list.get(i));
        }

        list.remove(2);

        System.out.println("-------------------------------");

        for (int i = 0; i < list.size(); i++){
            System.out.println(i + " - " + list.get(i));
        }
        list.add("6");
        list.add(2,"2,1");

        System.out.println("-------------------------------");

        for (int i = 0; i < list.size(); i++){
            System.out.println(i + " - " + list.get(i));
        }
    }
}
