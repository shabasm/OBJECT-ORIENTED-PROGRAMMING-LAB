import java.util.Scanner;

class Person {
    String name;
    String gender;
    String address;
    int age;

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class EmployeeInfo extends Person {
    int employeeId;
    String companyName;
    String qualification;
    double salary;

    EmployeeInfo(String name, String gender, String address, int age, int employeeId, String companyName,
            String qualification, double salary) {
        super(name, gender, address, age);
        this.employeeId = employeeId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends EmployeeInfo {
    String subject;
    String department;
    String teacherId;

    Teacher(String name, String gender, String address, int age, int employeeId, String companyName,
            String qualification, double salary, String subject, String department, String teacherId) {
        super(name, gender, address, age, employeeId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    public void display() {
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }
}

class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of teachers: ");
        int numberOfTeachers = scanner.nextInt();
        Teacher[] teachers = new Teacher[numberOfTeachers];

        for (int i = 0; i < numberOfTeachers; i++) {
            System.out.println("Enter details for teacher " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Gender: ");
            String gender = scanner.next();

            System.out.print("Address: ");
            String address = scanner.next();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Employee ID: ");
            int employeeId = scanner.nextInt();

            System.out.print("Company Name: ");
            String companyName = scanner.next();

            System.out.print("Qualification: ");
            String qualification = scanner.next();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            System.out.print("Subject: ");
            String subject = scanner.next();

            System.out.print("Department: ");
            String department = scanner.next();

            System.out.print("Teacher ID: ");
            String teacherId = scanner.next();

            teachers[i] = new Teacher(name, gender, address, age, employeeId, companyName, qualification, salary,
                    subject, department, teacherId);
        }

        System.out.println("\n--- Details of Teachers ---");
        for (int i = 0; i < teachers.length; i++) {
            teachers[i].display();
            System.out.println();
        }
        scanner.close();
    }
}
