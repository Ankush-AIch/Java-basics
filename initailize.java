import java.util.Scanner;

public class initailize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = in.nextInt();
        System.out.println("Enter the number b: ");
        int b = in.nextInt();
        int ans = 1;
        for (int i = 1; i < b ; i++) {
            ans *= a;
        }
        System.out.println("The answer is "+ans);
    }
}
