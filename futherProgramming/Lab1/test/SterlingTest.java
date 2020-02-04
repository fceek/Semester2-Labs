import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cf314
 */
public class SterlingTest {
    
    public SterlingTest() {
    }
    
    @Test
    public void testMultiply() {
        Sterling value = new Sterling(5);
        value.multiplyBy(2);
        assertEquals(5*2, value.getValue());
    }
    
    @Test
    public void testAdd() {
        Sterling value = new Sterling(6);
        value.add(15);
        assertEquals(6+15, value.getValue());
    }
}
