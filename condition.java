public class condition {
    public static void main(String []args)
    {
        boolean isalien = false;

        if (isalien == true) {
            System.out.println("it is not an alien");
            
        }
        int topscore = 80;
        if (topscore <= 100) {
            System.out.println("you got the highest score");
        }
        int secondtopscore = 81;
        if (topscore > secondtopscore && topscore < 100) {
            System.out.println("you have got the second highest marks in the school.");
        }
        if ((topscore > 90) || (secondtopscore <= 90)) {
            System.out.println("i dont know whats happaning");
        }
        int newvalue = 50;
        if(newvalue == 50){
            System.out.println("there is not an error");
        }
        boolean iscar = false;
        if ( iscar == true) {
            System.out.println("this is not supposed to happen");
        }
        String makeofcar = "audi" ;
        boolean isdomestic = makeofcar ==  "audi" ? false : true;
    }
}