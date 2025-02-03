package Lesson18.T1Abstract;

// При абстрактном классе невозможно создать объект, так как животное это и есть абстрактная сущность.
// Абстрактные классы предназначены для наследования (методы без реализации).
public abstract class Animal {
    private String sound;

    public Animal(){
    }

    public abstract String makeSound();

}
