package Lesson12.H07;

public class Main {
    public static void main(String[] args){
        Triangle triangle = new Triangle();
        Triangle triangle1 = new Triangle(5, 7, 8);

        triangle.getA();
        triangle.getB();
        triangle.getC();
        triangle.S();
        triangle.P();

        triangle1.getA();
        triangle1.getB();
        triangle1.getC();
        triangle1.S();
        triangle1.P();

        System.out.println(triangle.getA() + "/" + triangle.getB() + "/" + triangle.getC() + "/" + triangle.P() + "/" + triangle.S());
        System.out.println(triangle1.getA() + "/" + triangle1.getB() + "/" + triangle1.getC() + "/" + triangle1.P() + "/" + triangle1.S());
    }
}
