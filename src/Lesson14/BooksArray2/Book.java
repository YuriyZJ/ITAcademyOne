package Lesson14.BooksArray2;

import java.util.Objects;

public class Book {
    private int id;
    private String title;
    private String author;
    private int pages;

    public Book(int id, String title, String author, int pages){
        super();
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getPages(){
        return pages;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, pages);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && pages == book.pages && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

}
