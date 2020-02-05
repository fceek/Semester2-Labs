/**
 *
 * @author cf314
 */
public class Sterling {
    private int value;
    
    public Sterling(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int v) {
        value = v;
    }
    
    public void add(int increment) {
        value = value + increment;
    }
    
    public Sterling addValue(Sterling v) {
        return new Sterling(v.getValue() + value);
    }
    
    public void multiplyBy(int percentage) {
        value = value * percentage;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sterling other = (Sterling) obj;
        if (this.value != other.value) {
            return false;
        }
        return true;
    }
    
}
