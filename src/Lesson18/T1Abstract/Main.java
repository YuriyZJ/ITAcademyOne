package Lesson18.T1Abstract;

/*Базовый класс: Animal с методом sound() -
Производные классы: Dog, Cat, Cow.
Каждый производный класс должен переопределить метод sound(), чтобы напечатать соответствующий звук для животного.
Создайте объекты каждого производного класса и вызовите метод sound(), чтобы проверить функциональность.*/

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();

        System.out.println(dog.makeSound());
    }
}