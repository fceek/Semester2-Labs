import org.junit.Test;
import static org.junit.Assert.*;

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
    
    @Test
    public void testEquals() {
        Sterling value = new Sterling(7);
        assertEquals(true, (new Sterling(5).addValue(new Sterling(2))).equals(value));
    }

}
