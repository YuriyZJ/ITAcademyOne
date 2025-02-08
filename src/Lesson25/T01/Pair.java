package Lesson25.T01;

/*
Создать универсальный класс с именем Раг, который будет хранить пару значений, каждое из которых потенциально может иметь разные типы.
Затем создайте методы для получения и установки значений для каждого элемента в паре.
Наконец, реализуйте метод для обмена значениями между двумя разными объектами Pair, учитывая, что они имеют одинаковые типы
*/

import Lesson24.T02.Mark;

public class Pair<T, U> {
    private T name;
    private U value;

    public T getName(){
        return name;
    }

    public void setName(T name){
        this.name = name;
    }

    public U getValue(){
        return value;
    }

    public void setValue(U value){
        this.value = value;
    }

    public static <T, U> void swap (Pair<T, U> p1, Pair<T, U> p2){
        T tempName = p1.getName();
        U tempValue = p1.getValue();

        p1.setValue(p2.getValue());
        p1.setName(p2.getName());

        p2.setValue(tempValue);
        p2.setName(tempName);
    }
}
