/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Insertion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
  public   void insertion() {

        int[] reversed = {20, 18, 12, 8, 5, -2};



        Library.sort(reversed);

        String arr = Library.print(reversed);

        assertEquals("-2 5 8 12 18 20", arr);

    }
}
