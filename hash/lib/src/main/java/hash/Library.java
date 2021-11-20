
package hash;

public class Library {


    public static void main(String args[])
    {

        HashTable table = new HashTable();

        table.add(10, 36);
        table.add(15, 20);
        table.add(20, 40);
        table.add(20, 66);


        System.out.println(table.get(10));
        System.out.println(table.get(15));
        System.out.println(table.get(20));



        System.out.println( table.contain(15));
        System.out.println( table.hash(10));


    }

}
