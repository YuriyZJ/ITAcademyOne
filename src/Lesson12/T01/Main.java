package Lesson12.T01;

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Harry");
        Book book2 = new Book(105, "Deadline");
        Book book3 = new Book("Black car", 11);

        System.out.println(book1.getTitle());
        System.out.println(book2.getPrice() + "-" + book2.getTitle());
        System.out.println(book3.getTitle() + "-" + book3.getPrice());
    }

}
