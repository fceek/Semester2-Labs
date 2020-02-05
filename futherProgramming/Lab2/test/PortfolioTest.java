import org.junit.Test;
import static org.junit.Assert.*;

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

        Property bar1 = new Property("Pr", "48 Moulsecoomb");
        bar1.setPrice(new Sterling(50000));
        foo.add(bar1);

        ShareHolding bar2 = new ShareHolding("Sh");
        bar2.changePrice(new Sterling(500));
        foo.add(bar2);

        BankAccount bar3 = new BankAccount("Ba");
        bar3.makeTransaction(new Sterling(49900));
        foo.add(bar3);

        assertEquals(true, foo.getTotalValue().equals(new Sterling(150000)));
    }

}
