class Animal1 {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

public class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.makeSound();
        d.bark();
    }
}
