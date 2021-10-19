package linked.list;

public class ZipLists {
    public static void main(String[] args) {


        LinkedList list = new LinkedList();
        list.insert("c");
        list.insert("b");
        list.insert("a");

        LinkedList list2 = new LinkedList();
        list2.insert("d");
        list2.insert("e");
        list2.insert("f");

        LinkedList test =  ZipLists.linkedListZip(list, list2);
        System.out.println(test.toString());



    }


    public static LinkedList linkedListZip(LinkedList list1, LinkedList list2) {
LinkedList newLl = new LinkedList();
        Node current1 = list1.head;
        Node current2 = list2.head;
        while (current1 != null || current2 != null) {
            if (current1 != null) {
                newLl.insert(current1.data);
                current1 = current1.next;
            }
            if (current2 != null) {
                newLl.insert(current2.data);
                current2 = current2.next;
            }
        }
        return newLl;
    }


}
