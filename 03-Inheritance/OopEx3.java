public class OopEx3 {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.name="shiva";
        t1.age=20;
        t1.subject="java";
        t1.disp();
        t1.teach();


        Puppy p=new Puppy();
        p.eat();
        p.bark();
        p.weeps();

    }
}
class Person{
    String name;
    int age;
    void disp(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}
class Teacher extends Person{
    String subject;
    void teach(){
        System.out.println("subject: "+subject);
    }
}

class Animal{
    void eat(){
        System.out.println("i eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("bow");
    }
}
class Puppy extends Dog{
    void weeps(){
        System.out.println("woo");
    }
}