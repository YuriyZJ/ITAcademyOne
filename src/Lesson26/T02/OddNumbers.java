package Lesson26.T02;

//нечетные

public class OddNumbers implements Runnable{
    public void run() {
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.println(i);
        try {
            Thread.sleep(400);
        } catch (InterruptedException e){
            System.err.println(e);
        }
        }
    }
}
