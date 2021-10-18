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



   public void append(String value) {
        Node newLast = new Node(value);
        newLast.next = null;
        if (head == null) {
            head = newLast;
        } else {
            Node temp = new Node(value);
            temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newLast;
        }
    }



    public void insertBefore(String currentValue, String value) {
        if (head.data == currentValue) {
            Node n = new Node(value);
            n.next = head;
            head = n;
        } else {
            Node p = null;
            for (Node n = head; n.data != currentValue;
                 p = n, n = n.next)
                ;
            Node m = new Node(value);
            m.next = p.next;
            p.next = m;
        }
    }

    public void insertAfter(String currentValue, String value)
    {
         Node node = new Node(value);
        Node current = this.head;
        while (current != null) {
            if (current.data == currentValue) {
                node.next = current.next;
                current.next = node;
                break;
            }
            current = current.next;
        }
    }



    public String  kthFromEnd(int num) {
            if (num < 0) {
                String note = "number can't be less than 0";

                 return note;
            }
            Node item = this.head;
            int count = 0;
            while (item.next != null) {
                item = item.next;
                count++;
            }
            item = this.head;
            int finalCount = count - num;
            if (finalCount <= -1) {
                String note = "number can't be higher than the length of the list";

                return note;
            }
            for (int i = 0; i < finalCount; i++) {
                item = item.next;
            }
            return "The " + num + "   index from the tail is =  " + item.data;
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


