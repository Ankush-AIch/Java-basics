public class switch1 {
    public static void main(String[] args) {
        int switch_value  = 3;
        switch (switch_value) {
            case 1:
                System.out.println("the value was one");
                break;
                case 2:
                System.out.println("the value was two ");
                break;
                case 3: case 4 :case 5:
                System.out.println("the value is three");
                System.out.println("the value is four");
                System.out.println("the value is five");
               
            default:
            System.out.println("invalid value");
                break;
        }
    }
}