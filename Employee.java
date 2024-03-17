import java.util.Scanner;

class EmployeeDatabase {
    int empId;
    String empName;
    float empSalary;

    public EmployeeDatabase(int empId, String empName, float empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, wish, empId, i = 0;
        String empName;
        float empSalary;
        EmployeeDatabase[] empDetail = new EmployeeDatabase[5];

        do {
            System.out.println("------SELECT------\n1. Insert employee details\n2. Search employee details");
            System.out.print("Enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (i < empDetail.length) {
                        System.out.println("Enter ID:");
                        empId = scanner.nextInt();
                        System.out.println("Enter Name:");
                        empName = scanner.next();
                        System.out.println("Enter Salary:");
                        empSalary = scanner.nextFloat();
                        empDetail[i] = new EmployeeDatabase(empId, empName, empSalary);
                        i++;
                    } else
                        System.out.println("Cannot enter more.");
                    break;
                case 2:
                    System.out.println("Enter ID to search:");
                    int searchId = scanner.nextInt();
                    boolean found = false;
                    for (int j = 0; j < i; j++) {
                        if (empDetail[j].empId == searchId) {
                            empDetail[j].displayDetails();
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Employee not found.");
                    break;
            }
            System.out.println("Do you wish to continue?(1/0)");
            wish = scanner.nextInt();
        } while (wish == 1);
        
        scanner.close();
    }
}
