# Trees

Trees data structure implementation.

## Challenge

To create a tree class with three traversal methods (pre-order, in-order, post-order) and another sub-class that delivers two methods for scanning and inserting

## Approach & Efficiency

* The "Node" class, that represents the node object, including a value and a reference to the left and right nodes.

* The first class "BinaryTree" includes three traversal methods:
     1. inOrder: that prints the tree data as (Left, Root, Right).
     2. preOrder: that prints the tree data as (Root, Left, Right).
     3. postOrder: that prints the tree data as (Left, Right, Root).

* "BinarySearchTree" class that extends the original class and adds two methods:
     1. add: adding a node into the tree based on the binary search tree shape, by comparing the new node value by the root value.
     2. contains: returning a boolean indicating whether a node exists in the tree or not.



## API & Big(O) of Binary Tree
| Method           | Description                                                                            | Big-O Time  | Big-O Space  |
|------------------|----------------------------------------------------------------------------------------|-------------|--------------|
| inOrder() | Returns an ArrayList of the Node values or an in order traversal. (left, root, right)  | O(n)        | O(n)         |
| preOrder() | Returns an ArrayList of the Node values or a pre-order traversal. (root, left, right)  | O(n)        | O(n)         |
| postOrder()| Returns an ArrayList of the Node values or a post-order traversal. (left, right, root) | O(n)        | O(n)         |


# API & Big(O) of Binary Search Tree

| Method               | Description                                                                                            | Big-O Time  | Big-O Space  |
|----------------------|--------------------------------------------------------------------------------------------------------|-------------|--------------|
| add()     | adds a Node with input value to correct location in tree.                     | O(n)        | O(1)         |
| search()      |  searches the BST for a value. Returns Node if found, or null if not found.    | O(n)        | O(1)         |
