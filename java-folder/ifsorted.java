public class ifsorted {
    public static void main(String[] args) {
        int [] arr = {18,7,0,4,3};

        boolean issorted = true;
        //checking each pair of elements 
       for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i+1]) {
            issorted = false;
            break;
        }

        //for printing if sorted or not
        
       }
       if (issorted) {
            System.out.println("sorted");
        }else{
            System.out.println("not sorted");
        }

        //printing the array which is optional
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        }
    }

