class Animal{
    void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal {

    void bark(){
        System.out.println("barking...");
    }
    
}
 class inheritance5
{
    public static void main(String[] args) {
        Dog d= new Dog();
        Animal A= new Animal();
        d.bark();
        d.eat();

        // A.bark();
        A.eat();

    }
}