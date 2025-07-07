public class newproject {
    public static void main(String []args) {
        System.out.println();
      durationintime(8999);
      System.out.println(durationintime(98, 3));
      System.out.println(durationintime(9000));
    }
    public static String durationintime(int totalsecs) {
        if (totalsecs > 60) {   
           System.out.println( "invalid data for seconds ("+totalsecs+"), must be a positive integer.");
           return "";
        }
        int hour = totalsecs/3600;
        int minutes = (totalsecs % 3600) / 60;
        int seconds = totalsecs % 60;
        System.out.println(hour + "hours "+minutes+" minutes "+seconds+" seconds");
        return hour + "   hours "+minutes+" minutes "+seconds+" seconds";
        
    }
    public static String durationintime(int minutes, int secs) {
        int totalseconds = (minutes * 60) + secs;
        int hour =  totalseconds / 3600;
        int remainingseconds = totalseconds % 3600;
        int min =  remainingseconds % 60;
        return hour + "hours "+ min + " minutes "+remainingseconds+" seconds";
    }
}