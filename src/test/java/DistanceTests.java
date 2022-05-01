import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {

    @Test
    public void testArea(){
        Point p1 = new Point(5, 16);
        Point p2 = new Point(5, 2);

        Assert.assertEquals(p1.distance(p2), 14.0);
    }
}
