package Lesson03;

public class Lesson03T01 {
    public static void main(String[] args) {
        int x = 199;
        int y = 201;

        int a = x + y;
        int b = x - y;
        int c = x * y;
        int d = x / y;

        System.out.print(a + "/n" + b + "/n" + c + "/n" + d);
    }
}
/*
public class Lesson03T01{

public class Lesson03T01{
    public static void main (String[] args) {
        int a = 5;
        int b = 1;
        int c = 1;

        int z;

        z = (((a - 3) * b) / 2) + 4;

        System.out.println(z);
    }
}

public class Lesson03T01{
    public static void main (String[] args){

        double a = 5;
        double b = 5;
        double c = 5;

        double x;

        x = ((b + Math.sqrt(Math.pow(b,2))+4*b*c)/(2*a)) - (Math.pow(a,3)*c + Math.pow(b,-2));

        System.out.println(x);
    }
}

public class Lesson03T01{
    public static void main(String[] args){
        double a = 5;
        double b = 6;
        double c = 10;

        double per;
        double pl;

        if ( a + b > c && a + c > b && c + b > a){
            per = a + b + c;
            pl = (a + b) / 2;
                System.out.println(per + "\n" + pl);
        }
        else {
                System.out.println("Треугольник не сущесвует");
        }
    }
}


public class Lesson03T01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int composition = 1;

        while (number > 0) {
            int a = number % 10;
            composition *= a;
            number /= 10;
        }
        System.out.println(composition);
    }
}
*/
