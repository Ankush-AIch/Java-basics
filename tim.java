public class tim {
    public static void main(String[] args) {
        
        display_high_score_position("ankush", 2);
        int displaythemainthing = calculate_high_score_position(25);
        System.out.println("the score calculated was "+displaythemainthing);
    }



    public static void display_high_score_position(String player_name, int player_position) {
       System.out.println(player_name+" managed to get into position "+player_position+" on the high score list.");
    }


    public static int calculate_high_score_position(int player_score) {
     if (player_score >=1000) {
        return 1;
     }
     else if (player_score >= 500 && player_score<1000) {
        return 2;
     }
     else if (player_score>=100 && player_score<500) {
        return 3;
     }
     else{
        return 4;
     }
    }
}