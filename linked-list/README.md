
# Singly Linked List

An implementation for a linked list without using the built-in library.

## Challenge

To create the linked list classes without utilizing any built-in libraries. 

## Approach & Efficiency

I created a Node class, so I can make intense from it to create my linked list, then created a linked list class, so I can add some methods to manipulate the list whenever I create one

## API

**insert** :  Adds a new node with that value to the head of the list with an O(1) Time performance space will be also O(1) as it will take one parametere each run.

**includes** : Indicates whether that value exists as a Node’s value somewhere within the list so the time performance will be O(n) the space depends on the number of nodes so it will be O(n).

**toString** : Returns: a string representing all the values in the Linked List so the time performance will be O(n), formatted as:
`"{ a } -> { b } -> { c } -> NULL"`
the number of nodes so it will be O(n).


## specifications and tasks

- [x] Can successfully instantiate an empty linked list
- [x] Can properly insert into the linked list
- [x] The head property will properly point to the first node in the linked list
- [x] Can properly insert multiple nodes into the linked list
- [x] Will return true when finding a value within the linked list that exists
- [x] Will return false when searching for a value in the linked list that does not exist
- [x] Can properly return a collection of all the values that exist in the linked list


# DAY 2

# Challenge Summary
Extend the linked list with extra methods.

## Whiteboard Process 

![list](https://github.com/Emam96/data-structures-and-algorithms-401/blob/main/assests/My%20First%20Board%20(6).jpg?raw=true)

## Approach & Efficiency
Inserting At End of the list
We can use the following steps to insert a new node at end of the single linked list...
* Step 1: Create a newNode with given value and newNode → next as NULL.
* Step 2: Check whether list is Empty (head == NULL).
* Step 3: If it is Empty then, set head = newNode.
* Step 4: If it is Not Empty then, define a node pointer temp and initialize with head.
* Step 5: Keep moving the temp to its next node until it reaches to the last node in the list (until temp → next is equal to NULL).
* Step 6: Set temp → next = newNode.

Inserting At Specific location in the list (After a Node)
We can use the following steps to insert a new node after a node in the single linked list...
* Step 1: Create a newNode with given value.
* Step 2: Check whether list is Empty (head == NULL)
* Step 3: If it is Empty then, set newNode → next = NULL and head = newNode.
* Step 4: If it is Not Empty then, define a node pointer temp and initialize with head.
* Step 5: Keep moving the temp to its next node until it reaches to the node after which we want to insert the newNode (until temp1 → data is equal to location, here location is the node value after which we want to insert the newNode).
* Step 6: Every time check whether temp is reached to last node or not. If it is reached to last node then display 'Given node is not found in the list!!! Insertion not possible!!!' and terminate the function. Otherwise move the temp to next node.
* Step 7: Finally, Set 'newNode → next = temp → next' and 'temp → next = newNode'

# Day 3 

# Challenge Summary

adding a method that takes an integer (n) and return a node value from a linked list that places (n) from the tail of the linked list.

## Whiteboard Process

![list2](https://github.com/Emam96/data-structures-and-algorithms-401/blob/main/assests/Untitled.jpg?raw=true)

## Approach & Efficiency

First, we place a condition to process any arguments above 0 and returns a message to describe the error
We create a node and assign it as a head, we place a counter by adding an integer with the value of 0, we loop with the condition (node.next != null).
If we reached the max cap, we loop again with the counter - the passed integer
We add a condition to detect if the integer is bigger than the list and return an error.

## Solution

public String kthFromEnd(int num) {
if (num < 0) {
String note = "number can't be less than 0";

             return note;
        }
        Node item = this.head;
        int count = 0;
        while (item.next != null) {
            item = item.next;
            count++;
        }
        item = this.head;
        int finalCount = count - num;
        if (finalCount <= -1) {
            String note = "number can't be higher than the length of the list";

            return note;
        }
        for (int i = 0; i < finalCount; i++) {
            item = item.next;
        }
        return "The " + num + "   index from the tail is =  " + item.data;
    }

# Day 4 

# Challenge Summary
Zip two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list.

## Whiteboard Process
![list2](https://github.com/Emam96/data-structures-and-algorithms-401/blob/main/assests/Untitled%20(1).jpg?raw=true)



## Solution

public static LinkedList linkedListZip(LinkedList list1, LinkedList list2) {
LinkedList newLl = new LinkedList();
Node current1 = list1.head;
Node current2 = list2.head;
while (current1 != null || current2 != null) {
if (current1 != null) {
newLl.insert(current1.data);
current1 = current1.next;
}
if (current2 != null) {
newLl.insert(current2.data);
current2 = current2.next;
}
}
return newLl;
}