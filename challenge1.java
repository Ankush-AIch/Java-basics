public class challenge1 {
    public static void main(String[] args) {
        int count = 0; 
        int sum = 0;
        for(int i = 1; i <=1000; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("found "+i);
                count ++;
                sum+= i;
            }
            if(count ==5) break;
        }
        System.out.println("we got the sum of the numebers divisible by 3 and 5 = "+sum);
    }
}