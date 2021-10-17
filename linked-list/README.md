
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
