
public class Bins {
    private int[] bins;
    private int lowerBound;
    private int upperBound;
    public Bins(int lb, int ub) {
        bins = new int[ub+1 - lb];
        upperBound = ub;
        lowerBound = lb;
    }
    public int getBin(int bin) {
        return bins[bin - lowerBound];
    }
    public void incrementBin(int bin) {
        bins[bin - lowerBound] += 1;
    }
}
