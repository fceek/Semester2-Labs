import java.util.HashMap;

public class Portfolio {
    private HashMap<String, Asset> assets;
    private int total;
    
    public Portfolio() {
        this.total = 0;
        this.assets = new HashMap();
    }
    
    public void add(Asset newAsset) {
        assets.put(newAsset.getName(), newAsset);
    }
    
    public Asset getHoldingByName(String name) {
        return assets.get(name);
    }
    
    public Sterling getTotalValue() {
        assets.forEach((name, theAsset) -> {
            total = total + theAsset.getValue().getValue();
        });
        return new Sterling(total);
    }
}
