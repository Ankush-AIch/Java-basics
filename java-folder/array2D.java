public class array2D {
    public static void main(String []args){
        int[][] arr = {{30,89,45,78}, {25,78}, {37,70,16}};

       for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
       }
        
    }
}
