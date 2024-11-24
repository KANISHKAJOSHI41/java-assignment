// Base class
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class
class Dog extends Animal {
    // Overriding the sound method
    // @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class methodoverride {
    public static void main(String[] args) {
        // Creating an object of the base class
        Animal myAnimal = new Animal();
        myAnimal.sound(); // Calls the method from Animal class

        // Creating an object of the derived class
        Dog myDog = new Dog();
        myDog.sound(); // Calls the overridden method from Dog class
    }
}
