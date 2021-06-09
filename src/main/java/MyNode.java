
public class MyNode<K> {
    public MyNode next;
    public boolean data;

    private K key;

        public MyNode(K key){
            this.key = key;
            this.next = null;
        }

        public MyNode getNext() {
            return next;
        }

        public void setNext(MyNode next) {
            this.next = next;
        }

    }

