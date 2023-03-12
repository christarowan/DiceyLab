import org.junit.Test;

public class TestDice {

    @Test
    public void testDiceRoll(){

        Dice dice = new Dice(2);
        int result = dice.tossAndSum();
        assert (result<=12 && result>=2);
    }
    @Test
    public void testDiceRoll2(){

        Dice dice = new Dice(5);
        int result = dice.tossAndSum();
        assert (result<=30 && result>=5);
    }


}

