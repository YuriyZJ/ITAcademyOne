package Lesson25.T02;

public interface Processor<T> { //интерфейс процессор который параметризуется каким то типом Т
    T process(T t); //есть метод process который принимает тип Т и он его возвращает
}
