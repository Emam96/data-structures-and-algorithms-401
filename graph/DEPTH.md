# Challenge Summary

write a function which traverse a graph by depth first concept , and return a list of all the nodes traversed..

## Whiteboard Process

![board](https://i.imgur.com/k66JUV8.jpeg)

## Approach & Efficiency

the big O notation is:
O(n) for time because we use a loop .
O(1) for space because we didnt create a new list we only pass to an already created list.

## Solution

this is a sample of the code:

```
public static LinkedList<Node> depthFirstSearch(Node start){
        LinkedList result = new LinkedList();
        HashSet<Node> visited = new HashSet<>();

        Stack stack  = new Stack();
        stack.push(start);
        visited.add(start);

        while(!stack.isEmpty()){
            Node tempNode = (Node) stack.pop();
            result.add(tempNode);

            for(Edge neighbor: (HashSet<Edge>) tempNode.neighbors){
                if(!visited.contains(neighbor.node)){
                    stack.push(neighbor.node);
                    visited.add(neighbor.node);
                }
            }
        }
        return result;
    }

}
```
