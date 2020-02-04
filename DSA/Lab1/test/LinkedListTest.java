import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

public class LinkedListTest {

    @Test
    public void listTest() {
        LinkedList myList = new LinkedList();
        LinkedList newList = new LinkedList();
        Integer i1 = 10;
        Integer i2 = -5;
        myList.addFirst(new ListNode(i1, null));
        myList.addFirst(new ListNode(i2, null));
        try {
            newList = myList.reverse();
        } catch (Exception e) {
            // do nothing
        }
        //assertEquals(true, myList.contains((Integer)10));
    }
}