import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cf314
 */
public class PortfolioTest {
    
    public PortfolioTest() {
    }
    
    @Test 
    public void testAddAndGet() {
        Portfolio foo = new Portfolio();
        ShareHolding bar = new ShareHolding("bar A");
        foo.add(bar);
        assertEquals(bar, foo.getHoldingByName("bar A"));
    } 
    
    @Test
    public void testTotal() {
        Portfolio foo = new Portfolio();
        ShareHolding bar1 = new ShareHolding("bar1");
        foo.add(bar1);
        ShareHolding bar2 = new ShareHolding("bar2");
        foo.add(bar2);
        assertEquals(10*100 + 10*100, foo.getTotalValue().getValue());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
