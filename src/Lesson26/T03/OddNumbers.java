package Lesson26.T03;

//нечетные

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OddNumbers implements Runnable{
    public void run() {
        File file = new File("resources"); // создает каталог, если его нет
        if (!file.exists()) {
            file.mkdirs();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("resources/Lesson26", true))){ //FileWriter — нужен для работы с файлами (оборачивается BufferedWriter).
            for (int i = 1; i <= 10; i = i + 2) {
                writer.write(Integer.toString(i));
                writer.newLine(); // с новой строки вводит текст
            }
        } catch(IOException e){ //Если файл не найден или произошла ошибка записи, catch поймает IOException и выведет сообщение об ошибке.
            e.printStackTrace();
        }
        try {
            Thread.sleep(400);
        } catch (InterruptedException e){
            System.err.println(e);
        }
    }
}
