package oops;

class Animal {
    public void move() {
        System.out.println("Animal moves");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("Dog runs");
    }
    public void bark(){
        System.out.println("Dog barks");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Dog animal = new Dog();
  //      Dog dog = new Dog();

        animal.move(); // Output: Animal moves
//        dog.move();    // Output: Dog runs
//        dog.eat();     // Output: Animal eats
//        dog.bark();    // Output: Dog barks
    }
}