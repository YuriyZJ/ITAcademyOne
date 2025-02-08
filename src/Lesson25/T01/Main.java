package Lesson25.T01;

/*
Создать универсальный класс с именем Раг, который будет хранить пару значений, каждое из которых потенциально может иметь разные типы.
Затем создайте методы для получения и установки значений для каждого элемента в паре.
Наконец, реализуйте метод для обмена значениями между двумя разными объектами Pair, учитывая, что они имеют одинаковые типы
*/

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>();
        pair1.setValue("World");
        pair1.setName(100);

        Pair<Integer, String> pair2 = new Pair<>();
        pair2.setValue("Hello");
        pair2.setName(111);

        System.out.println(pair1.getName() + "///" +  pair2.getName());
        System.out.println(pair1.getValue() + "///" +  pair2.getValue());
        System.out.println();

        Pair.swap(pair1, pair2);
        System.out.println(pair1.getName() + "///" +  pair2.getName());
        System.out.println(pair1.getValue() + "///" +  pair2.getValue());
    }
}
