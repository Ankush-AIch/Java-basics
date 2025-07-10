public class bubblesort_string {
    public static void main(String[] args) {
        String[] arr = {"banana", "fig", "apple", "kiwi"};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j].length() > arr[j+1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+ " ");
       }
       System.out.println();
    }
}
