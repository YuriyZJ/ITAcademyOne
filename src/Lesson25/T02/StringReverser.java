package Lesson25.T02;

public class StringReverser implements Processor<String> {

    @Override
    public String process(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
