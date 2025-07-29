import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ": ");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            int[] marks = new int[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine(); // consume leftover newline

            students[i] = new Student(name, marks);
        }

        System.out.println("\n=== ALL STUDENT REPORT CARDS ===");
        for (Student student : students) {
            student.displayReportCard();
        }

        scanner.close();
    }
}