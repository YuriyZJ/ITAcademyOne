package Lesson21DAO.logic;

import Lesson21DAO.entity.Note;

import java.util.Date;
import java.util.List;

public interface NotebookLogic {

    void add(Note n);

    public void add(String title, String content);

    public List<Note> find(String text);

    public List<Note> find(Date date);

    public List<Note> allNotes();

}
