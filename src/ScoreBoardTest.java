import org.junit.Test;
import static org.junit.Assert.*;


public class ScoreBoardTest {


    @Test
    public void NewBoardTest(){
        ScoreBoard worldCup = new ScoreBoard();
        assertNotNull(worldCup);
    }
    @Test
    public void StartGameTest(){
        Match worldCupFinal = new Match("", "", new ScoreBoard());
        assertNotNull(worldCupFinal);
    }
    @Test
    public void UpdateTest(){
        Match worldCupFinal = new Match("", "", new ScoreBoard());
        worldCupFinal.update(2,3);
        assertEquals(2, worldCupFinal.scoreHome);
        assertEquals(3, worldCupFinal.scoreAway);
    }

    @Test
    public void FinishGameTest(){
        Match worldCupFinal = new Match("", "", new ScoreBoard());
        worldCupFinal.finishGame();
        assertFalse(worldCupFinal.scoreBoard.GamesInProgress().contains(worldCupFinal));
    }

    @Test
    public void GamesInProgressTest(){
        ScoreBoard worldCup = new ScoreBoard();
        Match worldCupFinal = new Match("Argentina", "Poland", worldCup);
        Match worldCupSemiFinal = new Match("Portugal", "Spain", worldCup);
        Match worldCupQuarterFinal = new Match("Brazil", "England", worldCup);
        worldCupSemiFinal.update(3,0);
        assertEquals(worldCupSemiFinal, worldCup.GamesInProgress().get(0));
        assertEquals(worldCupQuarterFinal, worldCup.GamesInProgress().get(1));
        assertEquals(worldCupFinal, worldCup.GamesInProgress().get(2));
    }

}
