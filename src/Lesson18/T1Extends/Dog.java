package Lesson18.T1Extends;

public class Dog extends Animal{

    private static final String DEFAULT_DOG_SOUND = "GAVV!!!";

    public Dog(){
        super(DEFAULT_DOG_SOUND);
    }

    public Dog(String sound){
        super(sound);
    }

    @Override
    public void sound() {
        System.out.println("гав");
    }

    public String getSound() {
        return DEFAULT_DOG_SOUND;
    }
}
