import java.util.Arrays;
public class selecionsort2 {
    public static void main(String[] args) {
        int [] arr = {35,75,13,26,15};
       //this is the outer loop for checking the whole array

       for (int i = 0; i < arr.length; i++) {
        int minIndex = i; //assumming that the index 0(35) is the smallest number, just assumming 

        //this is the inner loop for checking and updating the value 

        for (int j = i + 1; j < arr.length; j++) {
            //now for checking the actual smallest numeber in the array 
            if (arr[j] > arr[minIndex]) {
                minIndex = j; //updates the value of the mindex which is the actual smallest 
            }

            //the swapping part
            int temp = arr[minIndex];
            arr[minIndex] = arr[j];
            arr[j] = temp;
                }
       }
       //the printing part for array
       System.out.println("Sorted array: ");
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
}
