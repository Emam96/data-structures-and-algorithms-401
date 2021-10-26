package stack.and.queue;

public class Queue <T> {

     Node first;
    Node<T> last;

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




   public  T dequeue() {

       if (isEmpty())
       {
        return  (T) "Queue is empty";

       }
       Node<T> temp = first;
       first =  first.next;
       if (first == null) {
           last = null;
       }

       return (T) temp.data;
   }



    public   T peek()
    {

        if (first != null) {

           return  (T) first.data;
        }
        else {
            return (T) "Queue is empty";
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
