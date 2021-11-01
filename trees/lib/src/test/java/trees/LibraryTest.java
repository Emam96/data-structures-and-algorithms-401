
package trees;


import org.junit.jupiter.api.Test;



import java.util.Arrays;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;



class LibraryTest {


    @Test void emptyTreeTest() {
        BinarySearchTree tree = new BinarySearchTree();
        assertTrue(tree.isEmpty());
    }


    @Test void singleRootTest() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(1);
        assertFalse(tree.isEmpty());
    }


    @Test void addLeftRightChildren() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(2);
        tree.add(8);

       assertTrue(tree.root.left.value == 2);
        assertTrue(tree.root.right.value == 8);

    }



    @Test void testPreOrder() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(2);
        tree.add(8);


        List expected= tree.preOrder(tree.root);
        assertArrayEquals(Arrays.asList(5,2,8).toArray(), expected.toArray());
    }



    @Test void testInOrder() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(2);
        tree.add(8);

        System.out.println(tree.inOrder(tree.root));
        List expected= tree.inOrder(tree.root);
        assertArrayEquals(Arrays.asList(2,5,8).toArray(), expected.toArray());
    }

    @Test void testPostOrder() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(2);
        tree.add(8);

        System.out.println(tree.postOrder(tree.root));
        List expected= tree.postOrder(tree.root);
        assertArrayEquals(Arrays.asList(2,8,5).toArray(), expected.toArray());
    }

    @Test void testMaxHappyPath() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(2);
        tree.add(8);

       int max = tree.max();
       assertEquals(8, max);
    }

    @Test void testMaxFailure() {
        BinarySearchTree tree = new BinarySearchTree();


        int max = tree.max();
        assertEquals(0, max);
    }

    @Test void testMaxEdgeCase() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(2);
        tree.add(8);
        tree.add(8);

        int max = tree.max();
        System.out.println(max);
        assertEquals(8, max);
    }


    @Test void testBreadthFirstHappyPath() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(2);
        tree.add(8);
        tree.add(9);

        Queue<Integer> expected= Library.breadthFirst(tree);
        System.out.println(Library.breadthFirst(tree));
        assertEquals("[5, 2, 8, 9]", expected.toString());
    }

    @Test void testBreadthFirstFailure() {
        BinarySearchTree tree = new BinarySearchTree();
//        tree.add(5);
//        tree.add(2);
//        tree.add(8);
//        tree.add(9);

        Queue<Integer> expected= Library.breadthFirst(tree);
        System.out.println(Library.breadthFirst(tree));
        assertEquals(null, expected);
    }


    @Test void testBreadthFirstEdgeCase() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);

        Queue<Integer> expected= Library.breadthFirst(tree);
        System.out.println(Library.breadthFirst(tree));
        assertEquals("[5]", expected.toString());
    }

}
