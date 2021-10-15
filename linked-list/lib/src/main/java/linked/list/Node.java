package linked.list;

public class Node {

   String data;
    Node next;

    // Constructor
    Node(String d)
    {
        data = d;
        next = null;
    }

    public Node getNext()
    {
        return next;
    }


    public String getData()
    {
        return data;
    }


}



