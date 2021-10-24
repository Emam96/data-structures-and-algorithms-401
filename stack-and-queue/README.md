# Stacks and Queues
this an implementation for these data structure using Java, the implementation is based on linked list nodes

## Challenge
Using a Linked List as the underlying data storage mechanism, implement both a Stack and a Queue

## Approach & Efficiency



### Stack
Create a Stack class that has a top property. It creates an empty Stack when instantiated.
This object should be aware of a default empty value assigned to top when the stack is created.
The class should contain the following methods:
1. push
Arguments: value
adds a new node with that value to the top of the stack with an O(1) Time performance.
2. pop
Arguments: none
Returns: the value from node from the top of the stack
Removes the node from the top of the stack
Should raise exception when called on empty stack
3. peek
Arguments: none
Returns: Value of the node located at the top of the stack
Should raise exception when called on empty stack
4. is empty
Arguments: none
Returns: Boolean indicating whether or not the stack is empty.


### Queue
Create a Queue class that has a front property. It creates an empty Queue when instantiated.
This object should be aware of a default empty value assigned to front when the queue is created.
The class should contain the following methods:
1. enqueue
Arguments: value
adds a new node with that value to the back of the queue with an O(1) Time performance.
2. dequeue
Arguments: none
Returns: the value from node from the front of the queue
Removes the node from the front of the queue
Should raise exception when called on empty queue
3. peek
Arguments: none
Returns: Value of the node located at the front of the queue
Should raise exception when called on empty stack
4. is empty
Arguments: none
Returns: Boolean indicating whether or not the queue is empty


# Lab 11 

# Challenge Summary
Implement a Queue using two Stacks.

## Whiteboard Process
![queuewithtwostacks](https://github.com/Emam96/data-structures-and-algorithms-401/blob/main/assests/cc11.jpg?raw=true)

## Approach & Efficiency
enqueue
Arguments: value
Inserts value into the PseudoQueue, using a first-in, first-out approach.
dequeue
Arguments: none
Extracts a value from the PseudoQueue, using a first-in, first-out approach.h

## Solution
public class StackedQueue {

    static Stack stackOne = new Stack();
    static Stack stackTwo = new Stack();

    static void enQueue(String x)
    {
        while (!stackOne.isEmpty())
        {
            stackTwo.push(stackOne.pop());
        }

        stackOne.push(x);

        while (!stackTwo.isEmpty())
        {
            stackOne.push(stackTwo.pop());
        }
    }


    static String deQueue()
    {
        if (stackOne.isEmpty())
        {
            System.out.println("Q is Empty");
            System.exit(0);
        }

        String x = stackOne.peek();
        stackOne.pop();
        return x;
    }