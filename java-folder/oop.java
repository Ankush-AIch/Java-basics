class pen{
    String color;
    String type;

    public static void write(){
        System.out.println("writting something");
    }
}

public class oop{
    public static void main(String[] args) {
        pen pen1 = new pen();

        pen1.color = "red";
        pen1.type = "ball";

        pen1.write();
    }
}