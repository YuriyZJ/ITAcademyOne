package Lesson14.Books;

public class Library {

    private Book[] books;
    private int counterOfBooks;

    public Library() {
        books = new Book[10];
    }

    public Library(int size) {
        books = new Book[size];
    }

    public boolean add(Book b) {
        if (counterOfBooks >= books.length) {
            Book[] temp = new Book[books.length + 15];

            for (int i = 0; i < books.length; i++) {
                temp[i] = books[i];
            }
            books = temp;
        }
        books[counterOfBooks++] = b;
        return true;
    }

    public boolean delete(int idBook){
        int deleteIndex = -1;
        for (int i = 0; i < books.length; i++) {
            if(books[i].getId() == idBook){
                deleteIndex = i;
                break;
            }
        }
        if(deleteIndex < 0){
            return false;
        }
        for (int i = deleteIndex; i < counterOfBooks - 1; i++) {
            books[i] = books[i + 1];
        }
        counterOfBooks--;
        return true;
    }

    public void print(){
        System.out.println("---------------List Books---------------");
        for(int i = 0; i < counterOfBooks; i++){
            Book b = books[i];
            System.out.println("Book:    id:  " + b.getId());
            System.out.println("Title:  " + b.getTitle());
            System.out.println("Author:  " + b.getAuthor());
            System.out.println("Pages:  " + b.getPages());
        }
        System.out.println("---------------List Books---------------");
    }
}
