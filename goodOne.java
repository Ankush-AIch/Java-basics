import java.util.Scanner;

public class goodOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int even = 0;
        while(n > 0){
            int digit = n % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
           
           n /= 10;
        }
        System.out.println(sum);
    }
}