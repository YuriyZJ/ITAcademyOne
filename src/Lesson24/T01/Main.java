package Lesson24.T01;

/*Create a generic class named Box, with a single field of generic type.
Include methods to set and get the value of this field.
Create instances of Box class for different data types like Integer, String, and Double.
Set some values and retrieve them, printing the output to the console.*/

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<String>();
        stringBox.setValue("Hello");
        System.out.println(stringBox);

        Box<Integer> integerBox = new Box<Integer>();
        integerBox.setValue(100);
        System.out.println(integerBox.getValue());

        Box<Double> doubleBox = new Box<Double>();
        doubleBox.setValue(99.9);
        System.out.println(doubleBox.getValue());

        Box box1 = new Box();

        box1 = integerBox;
        box1 = doubleBox;
        box1 = stringBox;

        box1.setValue("Hey");
        System.out.println(box1.getValue());

        integerBox = box1;
        stringBox = box1;
        doubleBox = box1;

        Box<Object> box2 = new Box<Object>(); // параметризация объектом Object

        //box2 = integerBox;
        box2.setValue("Namaska");
        System.out.println(box2.getValue());

        //doubleBox = box2;
    }
}
