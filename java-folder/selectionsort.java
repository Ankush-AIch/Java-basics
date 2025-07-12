import java.util.Arrays;
public class selectionsort{
    public static void main(String[] args) {
        int [] arr = {64,25,13,22,11};
        
        //the outer loop for checking the whole array

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; //lets assume index 0 (64) is the smallest element in the array

            //inner loop for checking and finding the smallest number and swapping it

            for (int j = i + 1; j < arr.length; j++) {
                //finding the smallest value
                if (arr[j] < arr[minIndex]) {  //this line finds out the actual smallest element 
                    minIndex = j; //this line assigns or updates the value of index to smallest element
            }
          
        //swapping part
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;}
          
        }
        //print the sorted array 
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
    }
    System.out.println();
    }
}