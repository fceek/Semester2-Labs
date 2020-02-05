import org.junit.Test;
import static org.junit.Assert.*;

public class ShareHoldingTest {
    
    public ShareHoldingTest() {
    }

    @Test
    public void testSetPrice() {
        ShareHolding holding = new ShareHolding("foo");
        holding.setValue(new Sterling(15));
        assertEquals(15, holding.getValue().getValue());
    }
    
    public void testSetQty() {
        ShareHolding holding = new ShareHolding("bar");
        holding.setQty(400);
        assertEquals(400, holding.getQty());
    }

}
