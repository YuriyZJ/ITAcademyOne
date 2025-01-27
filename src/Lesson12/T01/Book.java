package Lesson12.T01;

public class Book {
    private String title = "хз";
    private int price = 100;

    public String getTitle(){
        return title;
    }

    public void setTitle(String _title){
        title = _title;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int _price) {
        price = _price;
    }

    public Book(String _title){
        title = _title;
    }

    public Book(int _price, String _title){
        price = _price;
        title = _title;
    }

    public Book(String _title, int _price){
        title = _title;
        price = _price;
    }

}
