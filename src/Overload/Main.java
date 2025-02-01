package Overload;

public class Main {
    public static void main(String[] args) {
        System.out.println(nod(4,13));
    }

    public static int nod(int x, int y) {
        while (x != 0 && y != 0) {
            if (x > y){
                x = x % y;
            } else {
                y = y % x;
            }
        }

        return x + y;
    }
}
