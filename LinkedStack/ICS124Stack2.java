/*
    A linked list implementation of a stack which uses the structures
    of LinkedList.java. (Therefore, is a child of LinkedList.)

    Complete the code as indicated by the comments
*/

/* Complete the class header
 */
import java.util.Stack;
import java.util.*;
public class ICS124Stack2 extends LinkedList implements Stack {

    /* Write the default (no parameter) constructor.
     Have it call the constructor of the super class.
    */
    public ICS124Stack2(){
        super();
    }

    /* Add @Override tags as appropriate.
     */

    /*
      Complete the method for the push operation.
      1. Create a new node containing the data given by the formal parameter.
      2. If the linked list is empty make the head and the tail refer to the new node.
         Otherwise, add the new node to the head of the linked list.
    */
    @Override
    public void push(Object data) {
        Node nodeCreation = createNode(data);

        if (this.head == null){
            head = nodeCreation;
        }
        else{
            nodeCreation.next = head;
            head = nodeCreation;
        }
    }

    /*
      Complete the method for the peek operation.
      This method returns the data from the top of the stack.
      The stack must remain unchanged.
      1. If the stack is empty peek throws a BlankSetException.
         See EmptyCollectionException.java that is written for you.
      2. Otherwise, return the data from the top of the stack.
         (Hint: return the data from the head of the list.)
    */
    public Object peek() throws BlankSetException {
        if(isEmpty()){
            throw new BlankSetException("null");
        }
        else {
            return head.data;
        }


    }

    /*
      Complete the method for the pop operation.
      This method does the same as peek and, in addition,
      it removes the item that is on top of the stack.
      1. Call peek to get the data from the top of the stack.
      2. Remove the top of the stack. (Hint: make the top
         of the stack the next item on the stack.)
      3. return the data that was returned by peek in step 1.

    */
    public Object pop() throws BlankSetException {
        if (head == null){
            throw new BlankSetException("null");
        }
        else{

            Object data = peek();
            head = head.next;
            return data;
        }
    }

}