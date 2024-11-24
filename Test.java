class Parent {
    // Static method in the parent class
    public static void display() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    // Static method in the child class hides the static method in the parent class
    public static void display() {
        System.out.println("Static method in Child class");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent.display(); // Calls the parent class static method
        Child.display();  // Calls the child class static method

        // Reference variable of type Parent
        Parent obj = new Child();
        obj.display(); // Calls the parent class static method (method hiding)
    }
}
