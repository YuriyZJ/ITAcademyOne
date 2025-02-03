package Lesson18.T1Extends;


public class Animal {
    String type;

    public Animal(){
    }

    public Animal(String type){
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void sound(){
        System.out.println("sound");
    }
}
