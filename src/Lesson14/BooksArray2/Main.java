package Lesson14.BooksArray2;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.add(new Book(1, "Java", "Ekkel", 210));
        library.add(new Book(2, "C++", "Straustruo", 300));
        library.add(new Book(3, "Asm", "Pinsler", 240));



        /*library.print();

        library.delete(2);

        library.print();*/

        Book book1 = new Book(1, "Java", "Ekkel", 210);
        Book book2 = new Book(1, "Java", "Ekkel", 210);

        System.out.println("book1 == book2 - " + (book1 == book2));
        System.out.println("book1.equals(book2) -" + (book1.equals(book2)));

        System.out.println("book1.hashCode()" + book1.hashCode());
        System.out.println("book2.hashCode()" + book2.hashCode());
    }
}
