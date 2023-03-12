import org.junit.Test;

public class TestBins {

    @Test
    public void testBinsl(){

        Bins bins = new Bins(2, 12);
        bins.incrementBin(4);
        int collect = bins.getBin(4);
        assert (collect == 1);
    }
}
