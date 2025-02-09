package Lesson26.T03;

//четные

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EvenNumbers extends Thread {
    public void run() {
        File file = new File("resources"); // создает каталог, если его нет
        if (!file.exists()) {
            file.mkdirs();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("resources/Lesson26", true))) {
            for (int i = 0; i <= 10; i = i + 2) {
                writer.write(String.valueOf(i));
                writer.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}