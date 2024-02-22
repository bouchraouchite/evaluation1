public class TennisGame2 implements TennisGame {
    public int player1Points = 0;
    public int player2Points = 0;

    public String player1Result = "";
    public String player2Result = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String score = "";
        if (player1Points == player2Points && player1Points < 4) {
            if (player1Points == 0)
                score = "Love";
            if (player1Points == 1)
                score = "Fifteen";
            if (player1Points == 2)
                score = "Thirty";
            score += "-All";
        }
        if (player1Points == player2Points && player1Points >= 3)
            score = "Deuce";

        if (player1Points > 0 && player2Points == 0) {
            if (player1Points == 1)
                player1Result = "Fifteen";
            if (player1Points == 2)
                player1Result = "Thirty";
            if (player1Points == 3)
                player1Result = "Forty";

            player2Result = "Love";
            score = player1Result + "-" + player2Result;
        }
        if (player2Points > 0 && player1Points == 0) {
            if (player2Points == 1)
                player2Result = "Fifteen";
            if (player2Points == 2)
                player2Result = "Thirty";
            if (player2Points == 3)
                player2Result = "Forty";

            player1Result = "Love";
            score = player1Result + "-" + player2Result;
        }

        if (player1Points > player2Points && player1Points < 4) {
            if (player1Points == 2)
                player1Result = "Thirty";
            if (player1Points == 3)
                player1Result = "Forty";
            if (player2Points == 1)
                player2Result = "Fifteen";
            if (player2Points == 2)
                player2Result = "Thirty";
            score = player1Result + "-" + player2Result;
        }
        if (player2Points > player1Points && player2Points < 4) {
            if (player2Points == 2)
                player2Result = "Thirty";
            if (player2Points == 3)
                player2Result = "Forty";
            if (player1Points == 1)
                player1Result = "Fifteen";
            if (player1Points == 2)
                player1Result = "Thirty";
            score = player1Result + "-" + player2Result;
        }

        if (player1Points > player2Points && player2Points >= 3) {
            score = "Advantage " + player1Name;
        }

        if (player2Points > player1Points && player1Points >= 3) {
            score = "Advantage " + player2Name;
        }

        if (player1Points >= 4 && player2Points >= 0 && (player1Points - player2Points) >= 2) {
            score = "Win for " + player1Name;
        }
        if (player2Points >= 4 && player1Points >= 0 && (player2Points - player1Points) >= 2) {
            score = "Win for " + player2Name;
        }
        return score;
    }

    public void SetP1Score(int number) {
        for (int i = 0; i < number; i++) {
            P1Score();
        }
    }

    public void SetP2Score(int number) {
        for (int i = 0; i < number; i++) {
            P2Score();
        }
    }

    public void P1Score() {
        player1Points++;
    }

    public void P2Score() {
        player2Points++;
    }

    public void wonPoint(String player) {
        if (player.equals("player1"))
            P1Score();
        else
            P2Score();
    }
}
