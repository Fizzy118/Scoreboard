/**
 This Match class provides methods that starts, updates and finishes new games. Each game has
 five attributes: home team, away team, home team score, away team score and scoreboard to whitch
 the match is assigned.
 */
public class Match {
    String home;
    String away;
    int scoreHome;
    int scoreAway;
    ScoreBoard scoreBoard;

    //constructor
    public Match(String homeTeam, String awayTeam, ScoreBoard board){
        home = homeTeam;
        away = awayTeam;
        scoreAway = 0;
        scoreHome = 0;
        scoreBoard = board;
        scoreBoard.matches.add(0, this);
        System.out.println("The match between "+ home + " and "+ away + " begins!");
    }

    //update method updates score.
    public void update(int updateScoreHome, int updateScoreAway){
        scoreHome = updateScoreHome;
        scoreAway = updateScoreAway;
        System.out.println("GOAL! " + home + " " + scoreHome + " - " + scoreAway + " " + away);
    }

    //finishGame method ends this match and remove it from scoreboard.
    public void finishGame(){
        scoreBoard.matches.remove(this);
        System.out.println("This is full time!");
    }
}
