import org.junit.Test;

public class BowlingTest {

    private Game game;

    @Test
    public void canCreate(){
        game = new Game();
    }

    @Test
    public void canRoll() {
        Game game = new Game();
        game.roll(0);
    }
}
