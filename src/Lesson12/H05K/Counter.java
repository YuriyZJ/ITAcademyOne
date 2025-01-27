package Lesson12.H05K;

/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
*/

public class Counter {
    private int counter;
    private int to;
    private int from;

    public Counter(){ //инициализацию счетчика значениями по умолчанию (дефолтные значения)
        counter = 0;
        from = 0;
        to = 10;
    }

    public Counter(int _from, int _to, int _counter){
        if (_from > _to){
            throw new RuntimeException("Диапазон не верен");
        }

        if (_from > _counter || _to < _counter){
            throw new RuntimeException("Неправильное начальное значение");
        }
        counter = _counter; //инициализация полей объекта
        from = _from;
        to = _to;
    }

    public int getCounter(){ // метод показывающий текущее состояние
        return counter;
    }

    public void setCounter(int _counter){
        if (from < _counter || to < _counter){
            throw new RuntimeException("Неправильное текущее значение");
        }
        counter = _counter;
    }

    public int increase(){
        counter++;
        if (counter > to){
            throw new RuntimeException("Значение больше допустимого");
        }
        return counter;
    }

    public int decrease(){
        counter--;
        if (counter < from){
            throw new RuntimeException("Значение меньше допустимого");
        }
        return counter;
    }
}
