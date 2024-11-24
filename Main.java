
interface Interface1 {
    void method1();
    void method2();
}


interface Interface2 {
    void method3();
    void method4();
}


interface Interface3 {
    void method5();
    void method6();
}
interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void method7();  
    
}
// Concrete class
class ConcreteClass {
    void concreteMethod() {
        System.out.println("Concrete class method called.");
    }
}

// Class implementing CombinedInterface and inheriting from ConcreteClass
class MyClass extends ConcreteClass implements CombinedInterface {

    // Implementing all methods from interfaces
    @Override
    public void method1() {
        System.out.println("Method1 from Interface1");
    }

    @Override
    public void method2() {
        System.out.println("Method2 from Interface1");
    }

    @Override
    public void method3() {
        System.out.println("Method3 from Interface2");
    }

    @Override
    public void method4() {
        System.out.println("Method4 from Interface2");
    }

    @Override
    public void method5() {
        System.out.println("Method5 from Interface3");
    }

    @Override
    public void method6() {
        System.out.println("Method6 from Interface3");
    }

    @Override
    public void method7() {
        System.out.println("Method7 from CombinedInterface");
    }
}

// Methods that accept different interfaces as arguments
public class Main {
    public static void methodWithInterface1(Interface1 obj) {
        obj.method1();
        obj.method2();
    }

    public static void methodWithInterface2(Interface2 obj) {
        obj.method3();
        obj.method4();
    }

    public static void methodWithInterface3(Interface3 obj) {
        obj.method5();
        obj.method6();
    }

    public static void methodWithCombinedInterface(CombinedInterface obj) {
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
        obj.method6();
        obj.method7();
    }

    public static void main(String[] args) {
       
        MyClass myObject = new MyClass();

        // Pass it to each method
        methodWithInterface1(myObject);            
        
        methodWithInterface2(myObject);           
        
        methodWithInterface3(myObject);           
        
        methodWithCombinedInterface(myObject);   
        
    }
}

