import java.util.Scanner;
public class loop0{
  public static void main(String []args){
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    for(int i = 1; i <= row; i++){
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      System.out.print("*");
    }
  }
}
      
    
