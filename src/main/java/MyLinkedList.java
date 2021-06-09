

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    /* @Description insert node into first node, second node and third node. */

    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);

        public class MyLinkedList<INode> {
            public INode head;
            public INode tail;


            public MyLinkedList() {
                this.head = null;
                this.tail = null;
            }

            public void add(INode newNode) {
                if (this.tail == null) {
                    this.tail = newNode;
                }
                if (this.head == null) {
                    this.head = newNode;
                } else {
                    INode tempNode = this.head;
                    this.head = newNode;
                    this.head.setNext(tempNode);
                }

            }

            /* @Description- this is used  to appending the data */

            public void append(INode myNode) {
                if (this.head == null) {
                    this.head = myNode;
                }
                if (this.tail == null) {
                    this.tail = myNode;
                } else {
                    this.tail.setNext(myNode);
                    this.tail = myNode;
                }
            }

            public INode pop() {
                INode tempNode = this.head;
                this.head = this.head.getNext();
                return tempNode;
            }

            public void printMyNodes() {
                StringBuffer myNodes = new StringBuffer("My Nodes : ");
                INode tempNode = head;
                while (tempNode.getNext() != null) {
                    myNodes.append(tempNode.getKey());
                    if (!tempNode.equals(tail)) myNodes.append("->");
                    tempNode = tempNode.getNext();
                }
                myNodes.append(tempNode.getKey());
                System.out.println(myNodes);
            }
        }
    }

    public void printMyNodes() {
    }

    public void append(MyNode<Integer> myThirdNode) {
    }
}
