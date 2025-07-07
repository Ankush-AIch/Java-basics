import java.util.Scanner;

public class anothernested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= row - i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
