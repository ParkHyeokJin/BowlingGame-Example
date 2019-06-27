import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BowlingTest {

    private Game game;

    @Test
    public void canRoll() {
        game.roll(0);
    }

    @Test
    public void gutterGame() {
        rollMany(20, 0);
        assertThat(game.score(), is(0));
    }

    private void rollMany(int rolls, int pins) {
        for (int i = 0; i < rolls; i++) {
            game.roll(pins);
        }
    }

    @Test
    public void allOnes() {
        rollMany(20, 1);
        assertThat(game.score(), is(20));
    }


}
