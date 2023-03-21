

public class LinkedList {
   /* This is your completed LinkedList from last lab with the following changes:
      0. Change the visibility modifiers in the Node and LinkedList classes as necessary.
         Remember visibility modifiers should be as restrictive as possible.
      1. Add methods isEmpty() and createNode(Object data).
      2. Remove the main method.
   */

    protected class Node {
        protected Object data;
        protected Node next;
    }

    // TO-DO: declare any required data members
    // ...
    protected Node head;
    protected Node tail;
    protected Node current;

    public LinkedList() {

        head = null;
        tail = null;

        // TO-DO: initialize all data members to
        // make this an empty LinkedList object.
        // ...

    }

    public boolean isEmpty(){
        if (head == null)
            return true;
        else{
            return false;
        }
    }

    public Node createNode(Object data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        return newNode;
    }


    public void add(Object obj) {

        Node aNode = new Node();
        aNode.data = obj;
        aNode.next = null;

        if(this.head == null){
            this.head = aNode;
            this.tail = aNode;
        }
        else {
            this.tail.next = aNode;
            this.tail = aNode;
        }

        // TO-DO: add "obj" to the end of the LinkedList.
        // ...
    }

    public void first() {

        this.current = this.head;

        // TO-DO: set an internal "next" pointer to the head Node of
        // the list.
        // ...
    }

    public Object next() {
        // TO-DO: return the data item pointed at by the internal "next" pointer, and then
        // advance the pointer.
        // ...

        if (current != null){
            Object newObj = this.current.data;
            this.current = current.next;
            return newObj;
        }
        else
            return null;
    }

    public Object getAt(int index) {
        // TO-DO: find the Node at the requested index (zero-based)
        // and return the data contained within that Node.
        // ...
        int indexNumber = 0;

        current = this.head;

        while (current != null){
            if (indexNumber == index){
                return current.data;
            }
            indexNumber++;
            current = current.next;
        }

        return null;
    }

    public static void main(String[] args) {
        // Do not modify the main for submission.
        // You may, of course, modify the main for your own testing purposes.
        LinkedList list = new LinkedList();
        list.add("bread");
        list.add("salad");
        list.add("potatoes");

        list.first();
        System.out.println(list.next());
        System.out.println(list.next());
        System.out.println(list.next());
    }
}

