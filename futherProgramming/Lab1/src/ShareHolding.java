/**
 *
 * @author cf314
 */
public class ShareHolding {
    private Sterling price;
    private int qty;
    private String name;
    
    public ShareHolding(String name) {
        this.price = new Sterling(10);
        this.qty = 100;
        this.name = name;
    }

    public Sterling getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
    
    public String getName() {
        return name;
    }
           
    public void setPrice(Sterling newPrice) {
        price = newPrice;
    }
    
    public void setQty(int newQty) {
        qty = newQty;
    }
}
