package Lesson24.Lesson24T01;

/*Create a generic class named Box, with a single field of generic type.
Include methods to set and get the value of this field.
Create instances of Box class for different data types like Integer, String, and Double.
Set some values and retrieve them, printing the output to the console.*/

public class Box<T> {
    private T value;

    public Box(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}
