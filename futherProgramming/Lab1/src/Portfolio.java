import java.util.HashMap;
/**
 *
 * @author cf314
 */
public class Portfolio {
    private HashMap<String, ShareHolding> shareHoldings;
    private int total;
    
    public Portfolio() {
        this.total = 0;
        this.shareHoldings = new HashMap<String, ShareHolding>();
    }
    
    public void add(ShareHolding newShareHolding) {
        shareHoldings.put(newShareHolding.getName(), newShareHolding);
    }
    
    public ShareHolding getHoldingByName(String name) {
        return shareHoldings.get(name);
    }
    
    public Sterling getTotalValue() {
        shareHoldings.forEach((name, holding) -> {
            total = total + holding.getPrice().getValue() * holding.getQty();
        });
        return new Sterling(total);
    }
}
