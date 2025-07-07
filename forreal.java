import java.util.Scanner;
 
public class forreal{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of rows in the pattern you want to make:");
        int row = in.nextInt();
        System.out.println("enter the number or columns in the pattern you want to make:");
        int col = in.nextInt();
        
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
                    System.out.println();
        }
        System.out.println();
    }
}