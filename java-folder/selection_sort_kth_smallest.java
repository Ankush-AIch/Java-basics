import java.util.Arrays;
public class selection_sort_kth_smallest {
    public static void main(String[] args) {
        int [] arr = {7, 10, 4, 3, 20, 15};
           int k = 3;
        //outer loop for checking the loop

        for (int i = 0; i < k; i++) {
            int mindex = i;
            //now the inner loop for checking and updation the value of the smallest number 
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[mindex]) {
                    mindex = j;
                }
            }
            //the swapping part
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
      //the printing part
      System.out.println("the kth smallest number is: "+arr[k-1]);
     
      System.out.println();
    }
}
