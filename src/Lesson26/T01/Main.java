package Lesson26.T01;

public class Main {
    public static void main(String[] args) {
        Talk talk = new Talk();
        Thread walk = new Thread(new Walk());
        talk.start();
        walk.start();
    }
}
