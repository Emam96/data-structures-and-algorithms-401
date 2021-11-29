# Graphs

## Challenge

Implement the Graph Class

<hr>

## Approach & Efficiency

To implement the Graph and node class. Created instance methods for the Graph class: addNode(), addEdge()
, getNodes(), getNeighbors(), size().

***addNode()***

Time complexity is O(V) time. where V is the number of vertices in the graph.

***addEdge()***

Finding that edge would take O(V) time, where V is the number of vertices in the graph.

***getNodes()***

o(1) because we are using a hashset to get items.

***getNeighbors()***

o(1) because we are using a hashset to get items.

<hr>

## API

***addNode()*** 

- Adds a new node to the graph
- Takes in the value of that node
- Returns the added node

***addEdge()*** 

- Adds a new edge between two nodes in the graph
- Include the ability to have a “weight”
- Takes in the two nodes to be connected by the edge
- Both nodes should already be in the Graph

***getNodes()*** 

- Returns all the nodes in the graph as a collection (set, list, or similar)

***getNeighbors()*** 

- Returns a collection of nodes connected to the given node
- Takes in a given node
- Include the weight of the connection in the returned collection

***size()*** 

- Returns the total number of nodes in the graph

<hr>

***Test***

Write tests to prove the following functionality:

- [x] Node can be successfully added to the graph
- [x] An edge can be successfully added to the graph
- [x] A collection of all nodes can be properly retrieved from the graph
- [x] All appropriate neighbors can be retrieved from the graph
- [x] Neighbors are returned with the weight between nodes included
- [x] The proper size is returned, representing the number of nodes in the graph
- [x] A graph with only one node and edge can be properly returned
- [x] An empty graph properly returns null

