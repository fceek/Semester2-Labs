import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PriorityQTest {
    public PriorityQTest() {}

    @Test
    public void testPriorityQueue() {
        PriorityQueue pq = new PriorityQueue();
        pq.insert(5, "5");
        pq.insert(10, "10");
        pq.removeMin();
        pq.removeMin();

        assertEquals(1, 1, "Just a Junit 5 test");
    }
}