public class ezamine{
    public static void main(String[] args) {
        int count  = 0 ; 
        for(int i = 10; i <=50; i++){
            if(isprime(i)){
                System.out.println("number "+i+" is a prime number ");
                count++; 
            }
            if (count == 3) {
                System.out.println("found 3. now exiting the loop.");
                break;
            }
        }
    }
    public static boolean isprime (int wholenumber){
        if (wholenumber <=2) {
            return (wholenumber ==2);
        }
        for (int divisor = 2; divisor <=wholenumber/2; divisor++){
            if(wholenumber %divisor == 0){
                return false;
            }
            
        }
        return true;
    }
}