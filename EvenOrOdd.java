import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int evencount = 0;
        int oddcount = 0;
        while(n > 0){
            int digit = n % 10;
            if (digit % 2 == 0) {
                evencount++;
            }
            else {
                oddcount++;
            }
            n /= 10;
        }
            System.out.println("Number of even digits = "+evencount);
            System.out.println("Number of odd digits = "+oddcount);
        
    }
}