import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by prohorova on 04.06.2018.
 */
public class SquareTests {

  @Test
  public void testArea(){
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }
}
