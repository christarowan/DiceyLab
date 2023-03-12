

        //Dice dice = new Dice(2); // for craps
        //Dice dice = new Dice(5); // for yatzee

        //Integer toss = dice.tossAndSum();

public class Dice {

    int numberOfDice;
    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int tossAndSum() {
        int result = 0;
        for (int i =0; i <numberOfDice; i++ ) {
            result += Math.floor(Math.random() *(6 - 1 + 1) + 1);

        }

        return result;
    }




}
