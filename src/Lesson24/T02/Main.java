package Lesson24.T02;

public class Main {
    public static void main(String[] args){
        Mark<Number> markN = new Mark<>(10.2);
        System.out.println(markN);
        System.out.println(markN.getMark());

        markN.roundMark();
        System.out.println(markN.roundMark());

        System.out.println(markN.same(markN));
        System.out.println();

        Mark<Integer> markI = new Mark<>(10);
        System.out.println(markI.getMark());

        markI.roundMark();
        System.out.println(markI);
        System.out.println(markI.roundMark());
        //System.out.println(markI.same(markN)); // ошибка компиляции

        System.out.println();
        System.out.println(markI.sameAny(markN));
    }
}
