package dk.danielgron.bowlinggamekata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BowlingGameKataApplicationTests{
    private Game g;

    @BeforeEach
    protected void setup(){
        g = new Game();
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }

    @Test
    public void testGutterGame(){
        rollMany(20, 0);
        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes(){
        rollMany(20,1);
        assertEquals(20, g.score());

    }

    @Test
    public void testOneSpare() {
        rollSpare();
        g.roll(3);
        rollMany(17,0);
        assertEquals(16,g.score());

    }

    @Test
    public void testOneStrike(){
        rollStrike();
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);
        assertEquals(24, g.score());
    }

    @Test
    public void testPerfectGame(){
        rollMany(12,10);
        assertEquals(300, g.score());
    }

    private void rollStrike() {
        g.roll(10);
    }

    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }

}
