package polymorphism;

public class Animal {

    public void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{

    public void sound() {
        System.out.println("Dog sound");
    }

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
    }
}