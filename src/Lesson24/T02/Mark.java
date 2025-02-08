package Lesson24.T02;

public class Mark<T extends Number> {
    private T mark;

    public Mark (T value) {
        mark = value;
    }

    public T getMark(){
        return mark;
    }

    public int roundMark (){
        return Math.round(mark.floatValue());
    }

    public boolean same (Mark<T> ob){
        return getMark() == ob.getMark();
    }

    public boolean sameAny (Mark<?> ob){
        return roundMark() == ob.roundMark();
    }
}
