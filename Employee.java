import java.util.Scanner;

class EmployeeDatabase {
    Scanner scanner = new Scanner(System.in);
    int i = 0;
    int[] empIdArray = new int[5];
    String[] empNameArray = new String[5];
    float[] empSalaryArray = new float[5];

    void insertDetail() {
        if (i < empIdArray.length) {
            System.out.println("Enter ID:");
            empIdArray[i] = scanner.nextInt();
            System.out.println("Enter Name:");
            empNameArray[i] = scanner.next();
            System.out.println("Enter Salary:");
            empSalaryArray[i] = scanner.nextFloat();
            i += 1;
        } else {
            System.out.println("Array is full. Cannot insert more employees.");
        }
    }

    void searchDetail() {
        System.out.println("Enter ID to search:");
        int searchId = scanner.nextInt();
        boolean found = false;
        for (int j = 0; j < i; j++) {
            if (empIdArray[j] == searchId) {
                System.out.println("Employee ID: " + empIdArray[j]);
                System.out.println("Employee Name: " + empNameArray[j]);
                System.out.println("Employee Salary: " + empSalaryArray[j]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
    }
}

public class Employee {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            int choice, wish;
            EmployeeDatabase empDetail = new EmployeeDatabase();

            do {
                System.out.println("------SELECT------\n1. Insert employee details\n2. Search employee details");
                System.out.print("Enter your choice:");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        empDetail.insertDetail();
                        break;
                    case 2:

                        empDetail.searchDetail();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
                System.out.println("Do you wish to continue?(1/0)");
                wish = scanner.nextInt();
            } while (wish == 1);
        }
    }
}
