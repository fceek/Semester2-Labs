import org.junit.Test;
import static org.junit.Assert.*;

public class AssetTest {
    
    public AssetTest() {
    }
    
    @Test
    public void testShareHolding() {
        ShareHolding foo = new ShareHolding("sHolding");
        foo.changePrice(new Sterling(5));
        
        assertEquals(true, foo.getValue().equals(new Sterling(500)));
    }

    @Test
    public void testBankAccount() {
        BankAccount bar = new BankAccount("bAccount");
        bar.makeTransaction(new Sterling(-50));

        assertEquals(true, bar.getValue().equals(new Sterling(50)));
    }

    @Test
    public void testProperty() {
        Property baz = new Property("property", "BN1 1FG");
        baz.setPrice(new Sterling(50000));
        
        assertEquals(true, baz.getValue().equals(new Sterling(50000)));
    }
}
