package Overload.Function.Fitcha;

public class Fitcha {
    // метол Евклида
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
