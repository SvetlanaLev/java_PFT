package training.PFT.sandbox;

import org.testng.annotations.Test;

/**
 * Created by User on 6/21/2016.
 */
public class SquareTests {
  @Test
  public void testArea () {
    Square s = new Square (7);
    assert s.area () ==49;
  }
}