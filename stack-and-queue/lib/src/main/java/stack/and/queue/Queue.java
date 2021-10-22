package stack.and.queue;

public class Queue {

     Node first;
     Node last;

     Queue()
    {
        this.first = null;
        this.last = null;
    }

    public void   enqueue(String val) {


        Node node = new Node(val);

        System.out.println( val + " has been added to the queue." + "\n");


        if (first == null)
        {

            first = node;
        }
        else {

            first.next = node;
        }
        last = node;
    }




   public String dequeue() {

       if (isEmpty())
       {
        return   "Queue is empty";

       }
       Node temp = first;
       first = first.next;
       if (first == null) {
           last = null;
       }

       return temp.data;
   }



    public   String peek()
    {

        if (first != null) {

           return   first.data;
        }
        else {
            return  "Queue is empty";
        }

    }



   public boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }


}
