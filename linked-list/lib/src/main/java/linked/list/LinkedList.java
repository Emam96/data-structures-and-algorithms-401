package linked.list;

public class LinkedList {

    public Node head;


    public LinkedList() {
        this.head = null;
    }



    public void insert(String newData)
    {

        Node newHead = new Node(newData);

        newHead.next = head;

        head = newHead;
    }



    public boolean includes(String value){
        Node indicator = head;
        while(indicator != null){
            if( indicator.data == value){
                System.out.println( value + "  is included");

                return true;
            }
            indicator = indicator.next;
        }
        System.out.println(value + "  is not included");
        return false;

    }


    public String toString() {

        String retStr = "Contents:\n";

        Node current = head;
        if (current == null) {

            retStr += "list is empty :(";
        }
        while(current != null){

              retStr += "{" + current.getData() + "} -> ";
            current = current.getNext();

        }

        return retStr;



    }


}


