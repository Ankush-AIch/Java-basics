public class bubblesort{
    public static void main(String[] args) {
        int [] arr = {36,19,29,12,5};

        //outer loop for pass it 
        for (int i = 0; i < arr.length -1; i++) {

            //inner loop for comparing and swaping the side by side elements
            for (int j = 0; j < arr.length-1-i; j++) {
                // if condition for checking the adjacent elements 
                if (arr[j] > arr[j+1]) {
                    //for swapping the elements if the first element is greater than the second
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}