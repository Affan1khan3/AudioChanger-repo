Array Stack

In the array implementation which implements BKStack, an array of doubles initialized at size 10 are used for the base structure of the stack. I used size 10 because it ran fast and efficiently. Although it is initially fixed to 10, it can dynamically resize itself to accommodate more elements when needed. I used a variable called amount to keep count on the size of the array and amount of elements inside of it. The array implementation is unique because it contains a resize function. This function checks the stack to see whether or not any more elements can be pushed on to it. If not, the function will use the amount variable to double the amount of spaces in the array. The function then utilizes a loop to copy all of the elements from the previous array into the new bigger array. 

The isEmpty() function checks whether the stack is empty or not by comparing the amount of elements to 0. If amount is 0, it returns true indicating that the stack is empty, else it returns false. The time complexion of this function is O(1) because it only utilizes an if statement


The count() function returns the current number of elements in the stack. The time complexion of this function is O(1) because it only contains a return which is instant.


The push(double d) function is used to push or add a new double value d onto the top of the stack. It first checks if the stack is full, if it is, it calls the resize() method. Then, it adds the new element d to the stack array at the amount index and increments the amount by 1. Time complexity of this function is O(1) unless the resize function is called, if it is, the time complexity is O(n).

The pop() function is used to remove and return the value from the top of the stack. It first checks if the stack is empty.If the stack is empty, it throws an EmptyStackException.
If the stack is not empty, it decrements the amount by 1 and returns the value at the updated amount index in the stack array. The time complexion is O(1) since only an if statement is used.

The peek() function is used to return the value at the top of the stack without removing it.
It first checks if the stack is empty using isEmpty() and throws an EmptyStackException if it is.
If the stack is not empty, it returns the value at the amount - 1 index in the stack array. Time complexity of this function is O(1) unless the resize function is called, if it is, the time complexity is O(n).


List Stack

The list implementation uses a linked list as the structure for the stack. A list node class is defined which is used as the stack structure for a single node in the list. All the nodes also have a pointer to the next node which is needed since traversing through a linked list is it’s difficulty. An iterator for the list stack is also created. This implements the iterator interface.The ListStack implementation has one member variable which is the head of the list. The list stack has a node that iterates nodes and also has a constructor. This constructor sets the node to the front of the list which is a variable called element in my code. 

All of the previous functions are of time complexity O(1) because they do not use for loops or anything else other than if statements or simple returns which are instant.
The ListStackIterator function is of time complexity O(1) because it is just creating an iterator for the list.
The count() function which uses the enhanced for loop is time complexity O(n).
The hasNext() function checks if the node is null. It checks to see if it is null so that we can know to iterate over that node or not. This function is of time complexity O(1)
The next() function returns the value of the current node. It then moves and iterates to the next node in sequence. This function is of time complexity O(1).
