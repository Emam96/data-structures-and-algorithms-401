
package graph;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Library {

    public static void main(String[] args) {

        Graph <String> graph3 = new Graph();

        graph3.addNode("Pandora");
        graph3.addNode("Arendelle");
        graph3.addNode("Metroville");
        graph3.addNode("Monstroplolis");
        graph3.addNode("Narnia");
        graph3.addNode("Naboo");

        graph3.addEdge("Pandora","Arendelle",150);
        graph3.addEdge("Pandora","Metroville",82);
        graph3.addEdge("Arendelle","Metroville",99);
        graph3.addEdge("Arendelle","Monstroplolis",42);

        graph3.addEdge("Metroville","Narnia",37);
        graph3.addEdge("Metroville","Naboo",26);
        graph3.addEdge("Metroville","Monstroplolis",105);

        graph3.addEdge("Monstroplolis","Naboo",73);
        graph3.addEdge("Narnia","Naboo",250);

      Node  pandora =  graph3.getNode("Pandora");
      Node  arendelle =  graph3.getNode("Arendelle");
      Node monstroplolis =  graph3.getNode("Monstroplolis");
      Node  naboo =  graph3.getNode("Naboo");

//        System.out.println(monstroplolis.neighbors.size());
//
//        System.out.println(getEdge(arendelle,monstroplolis).weight);
//        System.out.println(getEdge(monstroplolis,naboo).weight);


        String[] citys = {"Metroville", "Pandora"};
        String[] citys2={"Naboo", "Metroville"};
//        String output = businessTrip(graph3,citys);
        String output2 =businessTrip(graph3,citys2);
//        System.out.println(output);
        System.out.println(output2);

    }


public static String businessTrip(Graph graph, String[] cities) {
        int cost = 0;
        if (cities.length <= 1){
            return null;
        }

    for(int i = 0 ; i < cities.length -1; i++) {

        Node sourceNode = graph.getNode(cities[i]);
        Node destNode = graph.getNode(cities[i+1]);

        Edge edge = getEdge(sourceNode, destNode);
        if ( edge == null)
            return "False, $0";

        cost += edge.weight;
    }
    return "True, $"+cost;
}

    private static Edge getEdge(Node sourceNode, Node destNode) {
        boolean indexOfEdge = isThereDirectFlightbetweenTheCity(sourceNode, destNode);
        if(indexOfEdge == false)
            return null;
        else {
         Edge[] arr =  toArray(sourceNode.neighbors);

            for(int i = 0 ; i <= arr.length -1; i++) {
                if (arr[i].node == destNode) {
                    return arr[i];
                }
            }
           return null;
        }
    }


    private static boolean isThereDirectFlightbetweenTheCity(Node sourceNode, Node destNode) {
        Edge[] arr =  toArray(sourceNode.neighbors);

        for(int i = 0 ; i <= arr.length -1; i++) {
            if (arr[i].node == destNode) {
                return true;
            }
        }

       return false;
    }



public static Edge[] toArray(HashSet h) {

    Edge arr[] = new Edge[h.size()];
    int n=0;
    for(Object ele : h){
        arr[n++] = (Edge) ele;
    }
    return arr;
}




}
