public class methodchallenge {
    public static void main(String []args) {
      System.out.println("high in centimeters = "+ convert_to_centimeters(69));
      System.out.println("total height in inches is "+ convert_to_centimeters(5,9));
    }

    public static double convert_to_centimeters(int hightininches) {
        double cm = (hightininches *2.54);
        return cm;
    }

    public static double convert_to_centimeters(int hight_in_feet, int high_in_inches) {
        double totalinches = (hight_in_feet * 12) + high_in_inches;
        return totalinches;
    }
}
