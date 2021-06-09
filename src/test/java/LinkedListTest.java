
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    @Test
    public void givenValue_shouldAddInLinkedList(){
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(56);
        linkedList.add(36);
        linkedList.add(70);
        int size = linkedList.size();
        Assert.assertEquals(3,size);
    }
    @Test
    public  void givenValue_shouldAddAtFirst(){
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtFirst(56);
        linkedList.addAtFirst(36);
        linkedList.addAtFirst(70);
        linkedList.printValue();
        Assert.assertEquals(3, linkedList.size());

    }
}
