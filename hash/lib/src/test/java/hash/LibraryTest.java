/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hash;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

@Test
    public void addTest() {

    HashTable table = new HashTable();
    table.add(10, 36);
    System.out.println( table.contain(10));
     assertTrue(table.contain(10));
}

    @Test
    public void getTest() {

        HashTable table = new HashTable();
        table.add(10, 36);
        System.out.println( table.get(10));
        String result = table.get(10).toString();
        assertEquals("36", result);
    }

    @Test
    public void get404Test() {

        HashTable table = new HashTable();
        table.add(10, 36);
        System.out.println( table.get(11));
        assertEquals(null,  table.get(11));
    }



    // 4 and 5
    @Test
    public void collisionTest() {

        HashTable table = new HashTable();

        // 10 and  100 have the  same hash value of 0

        table.add(10, 36);
        table.add(100, 20);


       // if the value for the key 10 returned as null, it means that the collisions are not handled.

        assertFalse(table.get(10) == null);
    }




    @Test
    public void hashTest() {

        HashTable table = new HashTable();

        // my list size is 10

       int hashValue = table.hash(50);

        //  let's test if the hashed value will be smaller than 10.

        assertTrue(hashValue < 10);

    }


    ////////////////////////////////////////////////////////////////////////////////// Repeated word

    @Test
    public void wordHappyPath() {

        String exp = "Once upon a time, there was a brave princess who...";
        String result =  Library.repeatedWord(exp);
        assertEquals("a", result);

    }

    @Test
    public void wordFail() {

        String exp = "Once upon a time, there was  brave princess who...";
        String result =  Library.repeatedWord(exp);
        assertEquals("no repeated words", result);

    }


    @Test
    public void wordEdgeCase() {

        String exp = "";
        String result =  Library.repeatedWord(exp);
        assertEquals("no repeated words", result);

    }

    //////////////////////////////////////////////////////////////////////////////////////////// Tree


    @Test
    public void treeTest() {

        Tree tree = new Tree();
        tree.add(50);
        tree.add(1);
        tree.add(2);


        Tree tree2 = new Tree();
        tree2.add(88);
        tree2.add(1);
        tree2.add(2);

        List re = TreeIntersection.treeIntersection(tree, tree2);

        // There are two common values, so the size should equal 2.

        assertTrue(re.size() == 2);


    }


}
