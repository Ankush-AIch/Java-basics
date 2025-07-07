public class loops {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter ++) {
            System.out.println(counter);
        }
           for (double interestrate = 2; interestrate <= 5; interestrate++){
              double interestamount = calculateinterestrate(10000, interestrate);
              System.out.println("10000 at "+interestrate+"% = "+interestamount);
           }
           for(double i = 7.5; i <=10;i+=0.25){
            double interestamount = calculateinterestrate(100, i);
            System.out.println("$100 at "+i+"% interest = "+"$"+interestamount);
           }
    }
    public static double calculateinterestrate(double amount, double interestrate){
        double result =  (amount * (interestrate /100));
        return 7.0; 
    }
}
