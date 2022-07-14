import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MTest {
    public Main m;
    private boolean Tr=true;

    @Before
    public void setUp() {
        Main m = new Main();
    }

    @Test
    public void convertRomanToIntTest() {

        Assert.assertEquals(Tr, Main.wordPattern("abba","dog cat cat dog") );
    }
}
