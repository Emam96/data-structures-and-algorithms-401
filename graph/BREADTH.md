# Breadth First Search with Graph
Implement a breadth-first traversal on a graph.

## Challenge
Extend your graph object with a breadth-first traversal method that accepts a starting node. Without utilizing any of
the built-in methods available to your language, return a collection of nodes in the order they were visited.
Display the collection.

## Whiteboard Process

![bo](https://i.imgur.com/TMiP1Il.jpeg)


## Approach & Efficiency
Create a method that accepts a starting Node of a graph using a queue. The method returns a LinkedList of Nodes.
The queue will add the children of the current node while the queue is not empty. The queue will eventually remove
the nodes and add to LinkedList. Also, Using the Edge class, we check if the neighbor of the current node has been
visited.

Time | Space
--- | ---
O(n) since every vertex and every edge will be checked once. | O(n) where n is the maximum width of the tree

## Solution
````
public static LinkedList<Node> breadthFirstSearch(Node start){
        LinkedList resultList = new LinkedList();
        HashSet<Node> visited = new HashSet<>();

        if(start == null){
            throw new NullPointerException("Cannot be null");
        }

        Queue queue  = new LinkedList();
        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()){
            Node tempNode = (Node) queue.remove();
            resultList.add(tempNode);

            for(Edge neighbor: (HashSet<Edge>) tempNode.neighbors){
                if(!visited.contains(neighbor.node)){
                    queue.add(neighbor.node);
                    visited.add(neighbor.node);
                }
            }
        }
        return resultList;
    }
```
