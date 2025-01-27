package Lesson12.H02;

/* 2. Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса. */

public class Test2 {
    private int x;
    private String y;

    public int getX(){
        return x;
    }

    public void serX(int _x){
        x = _x;
    }

    public String getY(){
        return y;
    }

    public void setY(String _y){
        y = _y;
    }

    public Test2 (){
        x = 1;
        y = "Java";
    }

    public Test2 (int _x, String _y){
        x = _x;
        y = _y;
    }
}
