public class Simulation {
    private int numberOfDice;
    private int numberOfThrows;
    private Bins bins;
    public Simulation(int numberOfDice, int numberOfThrows) {
        this.numberOfDice = numberOfDice;
        this.numberOfThrows = numberOfThrows;
    }

    public void runSimulation() {
        int lowerBound = numberOfDice * 1;
        int upperBound = numberOfDice * 6;
        bins = new Bins(lowerBound, upperBound);
        Dice dice = new Dice(2);
        for (int i =0; i < numberOfThrows; i++) {
            int result = dice.tossAndSum();
            bins.incrementBin(result);
        }
    }

    public void printResults() {
        int lowerBound = numberOfDice * 1;
        int upperBound = numberOfDice * 6;
        System.out.println("***");
        System.out.format("Simulation of %d thrown for %d times.%n",numberOfDice,numberOfThrows);
        System.out.println("***");
        for (int i = lowerBound; i <= upperBound; i++) {
            int total = bins.getBin(i);
            float percent = ( (float) total/ (float) numberOfThrows);
            System.out.format("%2s",i);
            System.out.format(": %6s: ",total);
            System.out.format("%.2f ", percent);
            int numStars = (int) (percent * 100);
            for (int j = 0; j < numStars; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        sim.printResults();
    }



}
