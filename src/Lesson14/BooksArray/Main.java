package Lesson14.BooksArray;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.add(new Book(1, "Java", "Ekkel", 210));
        library.add(new Book(2, "C++", "Straustruo", 300));
        library.add(new Book(3, "Asm", "Pinsler", 240));

        library.print();

        library.delete(2);

        library.print();
    }
}
