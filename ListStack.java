/*
Affan Khan
aak200012
ListStack
 */

import java.util.EmptyStackException;
import java.util.Iterator;
// This class is an implementation of a stack using the linked list structure, it implements BKStack and Iterable
public class ListStack implements BKStack, Iterable<Double>{
    //create head of linked list
    private ListStackNode element;

    //create an iterator
    public Iterator iterator()
    {
        return new ListStackIterator(this);
    }

    //Function checks if the stack is empty/null
    public boolean isEmpty()
    {
        if(element==null)
            return true;
        else
            return false;
    }

    //Function checks and returns the size of stack
    public int count()
    {
        // Using a counter for the size
        int stackVal = 0;
        //Use for each loop to loop
        for(double d: this)//Uses iterator to traverse the stack
        {
            //add 1 each loop
            stackVal=stackVal+1;
        }
        //after loop ends, return the size of stack
        return stackVal;
    }

    //Function uses push function to put specified element to top of stack
    public void push(double d)
    {
        //create element to push
        ListStackNode value = new ListStackNode(d);

        // Adding it in front of the head and making it the head
        value.next = element;
        element = value;
    }

    //Function pop removes the top element of the stack
    public double pop()
    {
        //use if to check if the stack is empty
        if(isEmpty())
        {
            //if true, throw exception
            throw new EmptyStackException();
        }

        //create var and set it to value of element we are popping
        double var = element.val;

        //set element equal to next value
        element = element.next;

        //use return to output the value we popped
        //if(var==0)
        return var;
    }

    //Checks the top of the stack and returns the value
    public double peek()
    {
        //create a variable to see how many positions we are checking
        //int i = 0;
        //use if to check if stack is empty
        if(isEmpty())
        {
            //if true, throw exception
            throw new EmptyStackException();
        }

        //return the value of the element at the top of the stack
        return element.val;
    }

    //ListStackNode Class
    public class ListStackNode{
        //create variable for value of element/node
        public double val;

        //create ListStackNode Pointer
        public ListStackNode next = null;//to next

        //create ListStackNode constructor method
        //this method takes a parameter value n
        public ListStackNode(double n)
        {
            val = n;
        }
    }

    //Iterator implementation
    public class ListStackIterator implements Iterator{
        // Node which will be used to iterate
        ListStackNode stackList;

        //create constructor method
        public ListStackIterator(ListStack list)
        {
            //constructor stackList
            stackList = list.element;
        }

        //Function hasNext checks if node is null
        public boolean hasNext()
        {
            //check if not equal to null value
            return stackList != null;
        }

        //function next returns the value that stackList read
        public Double next()
        {
            //checks if there are more elements to iterate over in the list
            if (!hasNext())
            {
                //If there are no more elements to iterate over, exception is thrown
                throw new java.util.ConcurrentModificationException();
            }
            //create variable returning that holds value of stackList
            double returning = stackList.val;

            //set equal to the next value
            stackList = stackList.next;

            //return value
            return returning;
        }
    }
}

