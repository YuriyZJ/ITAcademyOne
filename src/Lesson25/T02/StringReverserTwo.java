package Lesson25.T02;

public class StringReverserTwo<T> implements Processor<T> { //параметризуем класс и параметризуем интерфейс
    @SuppressWarnings("unchecked") // аннотация, которая гасит предупреждения (Аннотация @SuppressWarnings("unchecked") подавляет это предупреждение, говоря компилятору: «Я осознаю риск, но всё нормально».)
    @Override
    public T process(T input) { //наследуем метод с этим же параметром
        return (T) new StringBuilder(input.toString()).reverse().toString();
    }
}
