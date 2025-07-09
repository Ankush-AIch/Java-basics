public class earlyswapexit {
    public static void main(String[] args) {
        int[] arr = {9,5,7,0,3};
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped = false;


            for (int j = 0; j < arr.length-1-i; j++) {  


                if (arr[j] > arr[j+1]) {


                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;

                }
            }
             if (!swapped) {
                
            break;
        }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

       
    }
}
