package training.PFT.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by User on 6/21/2016.
 */
public class SquareTests {
  @Test
  public void testArea () {
    Square s = new Square (7);
    Assert.assertEquals(s.area(), 49.0);
  }
}
