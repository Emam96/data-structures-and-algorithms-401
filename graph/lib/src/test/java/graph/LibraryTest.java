
package graph;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {



    @Test
    public void emptyGraph(){
        Graph graph = new Graph();
        assertEquals( 0, graph.getSize());
    }

    @Test
    public void addNode() {
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");
        assertTrue( graph.getSize() == 3);
        assertTrue( graph.getNodes().contains(cat));
        assertTrue( graph.getNodes().contains(dog));
        assertTrue( graph.getNodes().contains(hamster));
    }

    @Test
    public void addEdge() {
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");

//        assertTrue( graph.addEdge(cat, dog));
//        assertTrue( graph.addEdge(cat, hamster));

    }

    @Test
    public void getNodes() {
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");
        HashSet<Node> expected = new HashSet<>();
        expected.add(cat);
        expected.add(dog);
        expected.add(hamster);
        assertTrue( graph.getNodes().equals(expected));
    }

    @Test
    public void addNeighborNoWeight(){
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");
        assertTrue( cat.addNeighbor(dog));
    }

    @Test
    public void addNeighborWithWeight(){
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");
        assertTrue( cat.addNeighbor(dog, 50));
    }

    @Test
    public void getNeighbors() {
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");
        cat.addNeighbor(hamster);
        cat.addNeighbor(dog);
        HashSet expected = new HashSet<>();
        expected.add("hamster");
        expected.add("dog");
        assertEquals(expected.size(), graph.getNeighbors(cat).size());
//        assertEquals("Should equal", expected.toString().trim(), graph.getNeighbors(cat).toString().trim());
    }

    @Test
    public void getSize() {
        Graph graph = new Graph();
        graph.addNode("cat");
        graph.addNode("dog");
        graph.addNode("hamster");
        assertEquals( 3,  graph.getSize());
        graph.addNode("rabbit");
        graph.addNode("frog");
        graph.addNode("guinea pig");
        graph.addNode("cow");
        assertEquals( 7,  graph.getSize());
    }

////////////////////////////////////////////////////BREADTH
@Test
public void test_bfs(){
    Graph graph = new Graph();
    Node cat = graph.addNode("cat");
    Node dog = graph.addNode("dog");
    Node hamster = graph.addNode("hamster");
    cat.addNeighbor(dog, 20);
    cat.addNeighbor(hamster, 40);
    LinkedList<Node> expected = new LinkedList<>();
    expected.add(cat);
    expected.add(hamster);
    expected.add(dog);
    assertEquals( expected, graph.breadthFirstSearch(cat));
}

////////////////////////////////////////////////////////////////////DEPTH

    @Test
    public void test_dfs(){
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");
        cat.addNeighbor(dog, 20);
        cat.addNeighbor(hamster, 40);
        LinkedList<Node> expected = new LinkedList<>();
        expected.add(cat);
        expected.add(hamster);
        expected.add(dog);
        assertEquals( expected, graph.depthFirstSearch(cat));
    }

}
