import java.util.NoSuchElementException;

public class LinkedList {
    private ListNode head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(ListNode node) {
        node.setNext(head);
        head = node;
        ++size;
    }

    public void removeFirst() throws Exception {
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            ListNode temp = head;
            head = head.getNext();
            temp.setNext(null);
            size--;
        }
    }

    public void add(Object item) {
        addFirst(new ListNode(item, null));
    }

    public boolean contains(Object item) {
        ListNode currentNode = head;
        while (currentNode.getNext() != null) {
            if (currentNode.getData().equals(item)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        if (currentNode.getData().equals(item)) return true;
        else return false; 
    }

    public void remove(int index) throws Exception {
        if (index > size) {
            throw new NoSuchElementException();
        } else if (index == 1) {
            removeFirst();
        } else {
            ListNode previousNode = head;
            for (int i = 1; i < index - 1; i++) {
                previousNode = previousNode.getNext();
            }
            ListNode targetNode = previousNode.getNext();
            previousNode.setNext(targetNode.getNext());
            targetNode.setNext(null);
            size--;
        }
    }

    public void addAt(int index, Object item) throws Exception{
        if (index > size + 1) {
            throw new Exception();
        } else if (index == 1) {
            add(item);
        } else {
            ListNode previousNode = head;
            for (int i = 1; i < index - 1; i++) {
                previousNode = previousNode.getNext();
            }
            ListNode newNode = new ListNode(item, previousNode.getNext());
            previousNode.setNext(newNode);
            ++size;
        }
    }

    public LinkedList reverse() {
        LinkedList construct = new LinkedList();
        ListNode currentNode = head;
        ListNode pointerNode = null;
        do {
            ListNode thisNode = new ListNode(currentNode.getData(), pointerNode);
            construct.addFirst(thisNode);
            pointerNode = thisNode;
            currentNode = currentNode.getNext();
        } while (currentNode.getNext() != null);
        construct.addFirst(new ListNode(currentNode.getData(), pointerNode));
        return construct;
    }
}