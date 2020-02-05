public class Asset {
    private Sterling value;
    private String name;
    
    public Asset(String name) {
        this.value = new Sterling(100);
        this.name = name; 
    }
    
    public Sterling getValue() {
        return value;
    }
    
    public void setValue(Sterling v) {
        value = v;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
