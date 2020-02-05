public class Property extends Asset {
    private String address;

    public Property(String name, String address) {
        super(name);
        this.address = address;
    }

    public void setPrice(Sterling newPrice) {
        super.setValue(newPrice);
    }
    
}
