import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double f = in.nextDouble();
        System.out.println("Enter your second number to get proceed: ");
        double s = in.nextDouble();
        SimpleCalculator calc = new SimpleCalculator(f, s);

        while(true) { //operation menu
            System.out.println("/nChoose operation ");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4/ Division");
            System.out.println("5. Changing numbers");
            System.out.println("6. Exit");

            System.out.println("Your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1 :
                    System.out.println("The sum of the two numbers is " + calc.getAdditionResult());
                    break;
                case 2:
                System.out.println("The substraction of the two numbers is " + calc.getSubtractionResult());
                break;
                case 3:
                System.out.println("The multiplication of the two numbers is " + calc.getMultiplicationResult());
                break;
                case 4:
                System.out.println("The division of the two numbers is " + calc.getDivisionResult());
                break;
                case 5:
                    System.out.println("Changing numbers.......");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Exiting Calculator ........");
                    return;
            }
        }
    }
}