public class bubblecount {
  
    public static void main(String[] args) {
        //this program is for printing in descending order
        int[] arr = {15,13,11,10,8};
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length -1 -i; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Sorted array = "+arr[i]+" ");
        }
        System.out.println();
        System.out.println("The count of swaps are "+count);
    }
}


