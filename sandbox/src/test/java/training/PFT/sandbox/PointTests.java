package training.PFT.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by User on 6/21/2016.
 */
public class PointTests {
  @Test
  public void TestDistance() {
    Point p1 = new Point(3, 6);
    Point p2 = new Point(2, 4);
    Assert.assertEquals(p1.distance(p2), 2.23606797749979);
  }
}
