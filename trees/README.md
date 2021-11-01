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


# Code challenge 16 (max value)

Find the maximum value stored in the tree.

## Whiteboard Process

![max](https://i.imgur.com/qtU83BF.jpeg)

## Approach & Efficiency

* Time Complexity: O(N).
In the recursive function calls, every node of the tree is processed once and hence the complexity due to the function is O(N) if there are total N nodes in the tree. Therefore, the time complexity is O(N).

* Space Complexity: O(N).
Recursive call is happening. The every node is processed once and considering the stack space, the space complexity will be O(N).

## Solution

      if (node == null) {
       System.out.println("Tree is empty");
       return 0;
          }
        int res = node.value;
       int lres = findMax(node.left);
       int rres = findMax(node.right);

            if (lres > res)
                res = lres;
            if (rres > res)
                res = rres;
            return res;




# Challenge 17


Breadth-first Traversal For a binary tree.

## Whiteboard Process

![brdtth](https://i.imgur.com/GwSaew1.jpeg)


## Approach & Efficiency

Time Complexity: O(n) where n is the number of nodes in the binary tree
Space Complexity: O(n) where n is the number of nodes in the binary tree

## Solution

     public static  Queue<Integer> breadthFirst(BinaryTree tree) {
    Queue<Node> queue = new LinkedList<>() ;
     Queue<Integer> list = new LinkedList<>() ;
        if (tree.root == null)
     return null;
       queue.clear();
        queue.add(tree.root);
          list.add(tree.root.value);
        while(!queue.isEmpty()){
       Node node = queue.remove();

            if(node.left != null){
                queue.add(node.left);
            list.add(node.left.value);
            }
            if(node.right != null) {
                queue.add(node.right);
            list.add(node.right.value);
            }
             }
             return list;
                 }
