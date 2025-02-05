package Lesson21DAO.logic.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Lesson21DAO.dao.DaoProvider;
import Lesson21DAO.dao.NoteBookDao;
import Lesson21DAO.entity.Note;
import Lesson21DAO.logic.NotebookLogic;

public class NotebookLogicImpl implements NotebookLogic {
	
	private final DaoProvider provider = DaoProvider.getInstance();
	private final NoteBookDao dao = provider.getNoteBookDao();
	
	public void add(Note n) {		
		dao.save(n);
	}
	
	public void add(String title, String content) {

		Note n = new Note(title, content);
		dao.save(n);
		
	}
	
	public List<Note> find(String text){
		List<Note> result = new ArrayList<Note>();
		
		//NoteBookDao dao = new NoteBookDao();
		List<Note> myNotes = dao.allNotes();
		
		for(Note n : myNotes) {
			if(isTextInNote(n, text)) {
				result.add(n);
			}
		}
		
		return result;

	}
	
	private boolean isTextInNote(Note n, String text) {
		return n.getTitle().contains(text) || n.getContent().contains(text);
	}
	
	
	public List<Note> find(Date date){
		List<Note> result = new ArrayList<Note>();
		
		//NoteBookDao dao = new NoteBookDao();
		List<Note> myNotes = dao.allNotes();
		
		// ...d1.equals(d2);
		
		return result;
		
	}
	

	public List<Note> allNotes(){
		return dao.allNotes();
	}

}
