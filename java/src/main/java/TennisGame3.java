public class TennisGame3 implements TennisGame {

    private int player2Points;
    private int player1Points;
    private String player1Name;
    private String player2Name;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String score;
        if (player1Points < 4 && player2Points < 4 && !(player1Points + player2Points == 6)) {
            String[] pointStrings = new String[] { "Love", "Fifteen", "Thirty", "Forty" };
            score = pointStrings[player1Points];
            return (player1Points == player2Points) ? score + "-All" : score + "-" + pointStrings[player2Points];
        } else {
            if (player1Points == player2Points)
                return "Deuce";
            score = player1Points > player2Points ? player1Name : player2Name;
            return ((player1Points - player2Points) * (player1Points - player2Points) == 1) ? "Advantage " + score
                    : "Win for " + score;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            this.player1Points += 1;
        else
            this.player2Points += 1;
    }
}
