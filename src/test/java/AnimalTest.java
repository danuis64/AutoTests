import org.testng.Assert;
import org.testng.annotations.Test;

public class AnimalTest {

    @Test
    public void testSum1() {
        double a = 12;
        double b = 13;
        double c = 25;
        double k = 14;
        Assert.assertEquals(Calculator.sum(a, b), c, 0.01);
    }

    @Test
    public void testSumNegative() {
        double a = 1;
        double b = 2;
        double c = 4;
        Assert.assertNotEquals(Calculator.sum(a, b), c, 0.01);
    }
}
