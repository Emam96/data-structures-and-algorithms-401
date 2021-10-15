
# Singly Linked List

An implementation for a linked list without using the built-in library.

## Challenge

To create the linked list classes without utilizing any built-in libraries. 

## Approach & Efficiency

I created a Node class, so I can make intense from it to create my linked list, then created a linked list class, so I can add some methods to manipulate the list whenever I create one

## API

**insert** :  Adds a new node with that value to the head of the list with an O(1) Time performance.

**includes** : Indicates whether that value exists as a Node’s value somewhere within the list.

**toString** : Returns: a string representing all the values in the Linked List, formatted as:
`"{ a } -> { b } -> { c } -> NULL"`



## specifications and tasks

- [x] Can successfully instantiate an empty linked list
- [x] Can properly insert into the linked list
- [x] The head property will properly point to the first node in the linked list
- [x] Can properly insert multiple nodes into the linked list
- [x] Will return true when finding a value within the linked list that exists
- [x] Will return false when searching for a value in the linked list that does not exist
- [x] Can properly return a collection of all the values that exist in the linked list
