package Lesson21DAO.dao.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Lesson21DAO.dao.NoteBookDao;
import Lesson21DAO.entity.Note;

public class FileNoteBookDao implements NoteBookDao{

	@Override
	public void save(Note n) {                                                            //true — режим добавления (append). Если поставить false (или убрать true), файл будет перезаписываться заново.
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt", true))){ //FileWriter — нужен для работы с файлами (оборачивается BufferedWriter).
			writer.write(n.getId() + ";" + n.getTitle() + ";" + n.getContent()  + ";" + n.getD());
			writer.newLine(); // с новой строки вводит текст
		}
		catch(IOException e){ //Если файл не найден или произошла ошибка записи, catch поймает IOException и выведет сообщение об ошибке.
			e.printStackTrace();
		}

	}

	@Override
	public List<Note> allNotes() {
		List<Note> notes = new ArrayList<>();

		try {
			List<String> lines = Files.readAllLines(Path.of("text.txt")); // Читаем строки из файла
			for (String line : lines) {
				String[] parts = line.split(";"); // Разбиваем строку по ";"
				if (parts.length == 4) {
					int id = Integer.parseInt(parts[0]);
					String title = parts[1];
					String content = parts[2];
					Date date = new Date(parts[3]); // Создаем дату из строки
					notes.add(new Note(id, title, content, date)); // Создаем объект Note
				}
			}
		} catch (IOException e){
			e.printStackTrace();
		}
		return notes;
	}
}

	/*
	List<Note> allNotes = dao.allNotes();
	for (Note note : allNotes) {
			System.out.println(note);
	}*/
