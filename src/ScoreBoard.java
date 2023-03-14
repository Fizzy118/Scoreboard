import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 This ScoreBoard class provides method that return summary of games in progress ordered by total score.
 */

public class ScoreBoard {
    List<Match> matches;

    //constructor
    public ScoreBoard(){
        matches = new ArrayList<>();
    }

    //Returns all games that are currently in progress in order.
    public List<Match> GamesInProgress(){
        matches.sort(myComparator);
        return matches;
    }

    //comparator to compare two matches by their total score.
    Comparator<Match> myComparator =
            (m1, m2) -> Integer.compare(m2.scoreHome + m2.scoreAway, m1.scoreHome + m1.scoreAway);

}
