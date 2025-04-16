import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    private String grade;

    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public String toString() {
        return "ID: " + id + 
               ", Name: " + name + 
               ", Age: " + age + 
               ", Grade: " + grade;
    }
}

public class SchoolManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- SCHOOL MANAGEMENT SYSTEM (Basic) ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    viewStudents();
                    break;
                case "3":
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addStudent() {
        try 
            {
            System.out.print("Enter Student ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Grade: ");
            String grade = scanner.nextLine();
            Student student = new Student(id, name, age, grade);
            students.add(student);
            System.out.println("Student added successfully!");
        }
        catch (NumberFormatException e) 
            {
            System.out.println("Error: Please enter valid numbers for ID and Age.");
        }
        catch (Exception e) {
            System.out.println("Error: Something went wrong.");
        }
    }

    private static void viewStudents() 
    {
        if (students.isEmpty())
        {
            System.out.println("No student records available.");
        } 
        else
        {
            System.out.println("\n--- Student List ---");
            for (Student s : students)
                {
                System.out.println(s);
            }
        }
    }
}
