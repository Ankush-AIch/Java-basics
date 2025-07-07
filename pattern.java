import java.util.Scanner;



public class pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int row = in.nextInt();
        int col = in.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}