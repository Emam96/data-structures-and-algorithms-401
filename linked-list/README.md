
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

![list](https://github.com/Emam96/data-structures-and-algorithms-401/blob/main/assests/My%20First%20Board%20(5).jpg?raw=true)

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

