package Lesson12.H01;

public class Test1 {
    public int x = 10;
    public int y = 15;

    public void print(){
        System.out.println(x + " " + y);
    }

    public void xRef(int _x){
        x = _x;
    }

    public void yRef(int _y){
        y = _y;
    }

    public int summ (){
        return x + y;
    }

    public int max () {
        if ( x > y){
            return x;
        }
        return y;
    }
}
