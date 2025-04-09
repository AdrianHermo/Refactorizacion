public class Main {

    public static String getScore(int score1, int score2) {
        if (score1 == score2) {
            return getEqualScore(score1);
        } else if (score1 >= 4 || score2 >= 4) {
            return getAdvantageOrWin(score1, score2);
        } else {
            return getRegularScore(score1, score2);
        }
    }

    private static String getEqualScore(int score) {
        switch (score) {
            case 0: return "Love-All";
            case 1: return "Fifteen-All";
            case 2: return "Thirty-All";
            case 3: return "Forty-All";
            default: return "Deuce";
        }
    }

    private static String getAdvantageOrWin(int score1, int score2) {
        int diff = score1 - score2;
        if (diff == 1) return "Advantage player1";
        if (diff == -1) return "Advantage player2";
        if (diff >= 2) return "Win for player1";
        return "Win for player2";
    }

    private static String getScoreDescription(int score) {
        switch (score) {
            case 0: return "Love";
            case 1: return "Fifteen";
            case 2: return "Thirty";
            case 3: return "Forty";
            default: return "";
        }
    }

    private static String getRegularScore(int score1, int score2) {
        return getScoreDescription(score1) + "-" + getScoreDescription(score2);
    }
}