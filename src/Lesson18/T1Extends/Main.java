package Lesson18.T1Extends;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Dog dog1 = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        animal.sound();
        dog.sound();
        System.out.println(dog1.getSound());
        cat.sound();
        cow.sound();
    }
}
