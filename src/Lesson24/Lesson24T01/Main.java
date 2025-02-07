package Lesson24.Lesson24T01;

/*Create a generic class named Box, with a single field of generic type.
Include methods to set and get the value of this field.
Create instances of Box class for different data types like Integer, String, and Double.
Set some values and retrieve them, printing the output to the console.*/

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<String>("Hello");
        System.out.println(stringBox);

        Box<Integer> integerBox = new Box<Integer>(100);
        System.out.println(integerBox.getValue());

        Box<Double> doubleBox = new Box<Double>(99.9);
        System.out.println(doubleBox.getValue());
    }
}
