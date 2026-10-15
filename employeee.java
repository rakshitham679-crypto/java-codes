import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double salary;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine(); // Consume newl

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("\n----- Employee Details -----");
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.getData();
        emp.display();
    }
}
