public class ShareHolding extends Asset {
    private int qty;
    
    public ShareHolding(String name) {
        super(name);
        this.qty = 100;
    }

    public int getQty() {
        return qty;
    }
    
    public void setQty(int newQty) {
        qty = newQty;
    }

    public void changePrice(Sterling newPrice) {
        super.setValue(new Sterling(qty*(newPrice.getValue())));
    }
}
