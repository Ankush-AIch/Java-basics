import java.util.Scanner;

public class countGreaterThanFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = in.nextInt();
        int count = 0;
        while(n > 0){
            int digit = n % 10;
            if (digit > 5) {
                count++;
            }
            n /= 10;
        }
            System.out.println("The count of the number which are greater than 5 is "+count);
        
    }
}