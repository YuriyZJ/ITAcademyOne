package Lesson21DAO.dao;

import java.util.List;

import Lesson21DAO.entity.Note;

public interface NoteBookDao {

	void save(Note n);

	List<Note> allNotes();

}
