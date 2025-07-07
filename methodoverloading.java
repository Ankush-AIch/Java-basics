public class methodoverloading {
    public static void main(String[] args) {
        int newscore = calculate_score("ankush", 500);
        System.out.println("new score = "+newscore);

        calculate_score(25);
    }

    public static int calculate_score(String playername, int score) {
        System.out.println("player "+playername+" scored  "+score+" points");
        return score * 1000;
    }


    public static int calculate_score(int score) {
        System.out.println("leo scored "+score+" points");
        return score * 1000;
    }

       public static int calculate_score() {
       System.out.println("no player name or any score");
        return 0;
    }
}