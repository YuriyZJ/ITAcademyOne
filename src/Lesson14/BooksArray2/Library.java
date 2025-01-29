package Lesson14.BooksArray2;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<Book>();

    public Library() {
    }

    public Library(List<Book> books) {
        this.books = books;
    }

    public boolean add(Book b) {
        return books.add(b);
    }

    public boolean delete(int idBook){
        int deleteIndex = -1;
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getId() == idBook){
                deleteIndex = i;
                break;
            }
        }
        if(deleteIndex < 0){
            return false;
        }
        books.remove(deleteIndex);
        return true;
    }


    public Book findByTitle(String title){
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i); // books[i]
            String titleBook = b.getTitle();
            if (titleBook.contains(title)) {
                return b;
            }
        }

        return null;
    }

    public boolean isInLibrary(Book book) {
        return books.contains(book);
    }

    public void print(){
        System.out.println("---------------List Books---------------");
        for(int i = 0; i < books.size(); i++){
            Book b = books.get(i);
            System.out.println("Book:    id:  " + b.getId());
            System.out.println("Title:  " + b.getTitle());
            System.out.println("Author:  " + b.getAuthor());
            System.out.println("Pages:  " + b.getPages());
        }
        System.out.println("---------------List Books---------------");
    }
}
