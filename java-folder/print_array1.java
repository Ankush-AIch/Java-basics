public class print_array1 {
    public static void main(String[] args) {
        array1d(0);
        array2d(0);
    }
    // this is for 1d array.
    public static void array1d(int a){
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr [2] =  30;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // this is for 2d array
    public static void array2d(int a){
        int [][] arr  = {{20,40},{30,50,78}};
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
