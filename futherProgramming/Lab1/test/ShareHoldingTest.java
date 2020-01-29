import org.junit.After;
import org.junit.Before;
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
    
    public void testSetQty() {
        ShareHolding holding = new ShareHolding("bar");
        holding.setQty(400);
        assertEquals(400, holding.getQty());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
