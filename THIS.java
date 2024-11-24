class Student {
    private int id;
    private String name;
    public Student(int id, String name) {
        this.id = id; 
        this.name = name;
    }

    public void display() {
        System.out.println("Student ID: " + this.id);
        System.out.println("Student Name: " + this.name);
    }
    public void show() {
        this.display(); 
    }
}
public class THIS {
    public static void main(String[] args) {
        Student student = new Student(101, "John Doe");
        student.show();
    }
}
