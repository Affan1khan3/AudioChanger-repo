/*
Affan Khan
aak200012
ArrayStack
 */


import java.util.EmptyStackException;

public class ArrayStack implements BKStack{
    //Set stack initial amount
    public static final int INITIAL_CAPACITY = 10;

    // Size of the array
    private int amount = 0;

    // create stack
    private double[] stack = new double[INITIAL_CAPACITY];


    //function isEmpty checks to see if array is empty
    public boolean isEmpty(){
        //int value = size;
        if(amount==0)
            return true;
        else
            return false;
    }

    //Function used to get the size of the array
    public int count(){
        //set size to variable called value
        int value = amount;
        //return size of array
        return value;
    }

    // Pushing value to the top of the stack
    public void push(double d){
        //check if array is full
        if(amount == stack.length)
        {
            //use resize function to double value of array
            resize();
        }

        //add element to stack and then add 1 to size of array
        //int val = size;
        stack[amount++] = d;
    }

    //This function takes element from the top of the stack off with pop
    public double pop(){
        //check if the array is empty
        if(isEmpty())
        {
            //if true, throw exception
            throw new EmptyStackException();
        }

        //return the value at the top of the stack and the minus 1 from array
        //int val = size;
        return stack[--amount];
    }

    // Returning value at the top of the stack
    public double peek(){
        //check if the array is empty or not
        if(isEmpty())
        {
            //if true, throw exception
            throw new EmptyStackException();
        }

        //output the value at the top of the stack
        //int val = size;
        return stack[amount - 1];
    }

    //this function will increase and double the size of the array after checking if it is full
    private void resize(){
        //initialize new stack called biggerStack with double the size of old stack
        double[] biggerStack = new double[stack.length * 2];

        //use for loop to loop through new stack and copy all values from old stack into new bigger stack
        for(int i = 0; i < stack.length; i++)
        {
            //copy values into biggerStack from stack
            biggerStack[i] = stack[i];
        }
        //Set stack to BiggerStack
        stack = biggerStack;
    }


}
