public class paraconstructor3 {
    
        String name;
        int age;
    
        // Parameterized constructor
        public paraconstructor3(String name, int age) {
            this.name = name;
            this.age = age;
        }
    
        public void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    
        public static void main(String[] args) {
            // Creating an instance of class using the parameterized constructor
            paraconstructor3 person = new paraconstructor3("John", 25);
            person.display();
        }
    }
    

