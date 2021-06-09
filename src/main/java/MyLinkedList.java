

public class MyLinkedList {
    private Node head;
    int size =0;

    public boolean add(Integer data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return true;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;

        }
        temp.next = newNode;
        size++;
        return true;
    }
    
    public int size(){
        return size;
    }
    public boolean addAtFirst(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return true;
        }
        newNode.next = head;
        head = newNode;
        return true;
    }
    public void printValue(){
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
