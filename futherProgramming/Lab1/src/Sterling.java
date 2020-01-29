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
    
    public void add(int increment) {
        value = value + increment;
    }
    
    public void multiplyBy(int percentage) {
        value = value * percentage;
    }
}
