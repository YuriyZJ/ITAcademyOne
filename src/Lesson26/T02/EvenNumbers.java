package Lesson26.T02;

//четные

public class EvenNumbers extends Thread{
    public void run(){
        for (int i = 0; i <= 10; i = i + 2){
            System.out.println(i);
        try {
            Thread.sleep(400);
        }
        catch (InterruptedException e){
            System.err.println(e);
        }
        }
    }
}
