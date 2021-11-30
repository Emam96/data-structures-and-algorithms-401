package graph;

import java.util.*;

public class Graph<T> {

    public HashSet<Node<T>> vertices;

    public Graph(){
        this.vertices = new HashSet<>();
    }

    @SuppressWarnings("unchecked")
    public Node<T>addNode(T data){
        Node node = new Node(data);
        this.vertices.add(node);
        return node;
    }

//    public boolean addEdge(Node<T> source, Node<T> destination){
//        if(this.vertices.contains(source) && this.vertices.contains(destination)){
//            this.vertices.add(source);
//            this.vertices.add(destination);
//            return true;
//        }
//        return false;
//    }



    public void addEdge( T value1, T value2, int weight) {
        if( isNodeExist(value1) && isNodeExist(value2)){
            Node node1 = getNode(value1);
            Node node2 = getNode(value2);
//            Edge neighborForNode1 = new Edge(node2,weight);
//            Edge neighborForNode2 = new Edge(node1,weight);
            node1.addNeighbor(node2,weight);
            node2.addNeighbor(node1,weight);
        }
    }
    private boolean isNodeExist(T value){
        Node node1 = getNode(value);
        return vertices.contains(node1);
    }


    public HashSet<Node<T>>getNodes(){
        return this.vertices;
    }

    public Node getNode(T value) {

        Node arr[] = new Node[vertices.size()];
        int n=0;
        for(Node ele:vertices){
            arr[n++] = ele;
        }
        for(int i = 0 ; i < arr.length -1; i++) {
          if (arr[i].data == value) {
              return arr[i];
          }
        }
return null;
    }





    public HashSet<Edge> getNeighbors(Node<T> node){
        return node.neighbors;
    }

    public int getSize(){
        return this.vertices.size();
    }


/////////////////////////////////////////////////////BREADTH

    @SuppressWarnings("unchecked")
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

/////////////////////////////////////////////////////////////////DEPTH

    @SuppressWarnings("unchecked")
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
