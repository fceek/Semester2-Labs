import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cf314
 */
public class ShareHoldingTest {
    
    public ShareHoldingTest() {
    }

    @Test
    public void testSetPrice() {
        ShareHolding holding = new ShareHolding("foo");
        holding.setPrice(new Sterling(15));
        assertEquals(15, holding.getPrice().getValue());
    }
    
    @Test
    public void testSetQty() {
        ShareHolding holding = new ShareHolding("bar");
        holding.setQty(400);
        assertEquals(400, holding.getQty());
    }
}
