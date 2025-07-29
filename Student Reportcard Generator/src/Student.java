public class Student {
    private String name;
    private int[] marks = new int[3]; // for 3 subjects
    private int total;
    private double percentage;
    private char grade;

    // Constructor
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        calculateTotal();
        calculatePercentage();
        calculateGrade();
    }

    // Getters and Setters (Encapsulation)
    public String getName() { return name; }
    public int[] getMarks() { return marks; }
    public int getTotal() { return total; }
    public double getPercentage() { return percentage; }
    public char getGrade() { return grade; }

    // Calculation Methods
    private void calculateTotal() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
    }

    private void calculatePercentage() {
        percentage = total / 3.0;
    }

    private void calculateGrade() {
        if (percentage >= 90) grade = 'A';
        else if (percentage >= 80) grade = 'B';
        else if (percentage >= 70) grade = 'C';
        else if (percentage >= 60) grade = 'D';
        else grade = 'F';
    }

    public void displayReportCard() {
        System.out.println("------ Report Card ------");
        System.out.println("Name: " + name);
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("  Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("--------------------------\n");
    }
}

