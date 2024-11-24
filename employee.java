import java.util.Scanner;
class employee {
    private int emp_id;
    private String emp_name;
    private double basic_salary;
    private double gross_salary;
    public employee(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
        calculateGrossSalary();
    }
    private void calculateGrossSalary() {
        double hra = 0.10 * basic_salary; 
        double da = 0.15 * basic_salary; 
        gross_salary = basic_salary + hra + da;
    }
    public void showData() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Gross Salary: " + gross_salary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int emp_id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String emp_name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basic_salary = sc.nextDouble();
        employee employee = new employee(emp_id, emp_name, basic_salary);
        employee.showData();
        
    }
}


