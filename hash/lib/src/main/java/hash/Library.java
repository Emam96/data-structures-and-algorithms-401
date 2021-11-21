
package hash;

public class Library {


    public static void main(String args[])
    {

        HashTable table = new HashTable();

        table.add(10, 36);

        table.add(100, 20);
//        table.add(1, 20);
//        table.add(2, 20);
//
//        table.getSize();
//
//        table.add(3, 20);
//        table.add(4, 20);
//        table.add(5, 20);
//        table.add(6, 20);

//       table.getSize();

        System.out.println(table.get(10));
        System.out.println(table.get(100));

//        System.out.println( table.hash(10));


    }

}
