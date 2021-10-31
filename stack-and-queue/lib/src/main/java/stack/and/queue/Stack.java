package stack.and.queue;



public class Stack <T> {

    Node<T> top;

    Stack()
    {

        this.top = null;
    }


    public void push( T data)
    {
        Node<T> temp = new Node<>(data);
//        temp.data = data;
        temp.next =  top;
        top = temp;
//        System.out.println(data + " placed on top");
    }

//
//    public T pop()
//    {
//
//        if (!isEmpty()) {
//            System.out.println( top.data + " Removed from top");
//            top = Node<T> top.link;
//
//        } else {
//
//            System.out.println("Stack is empty");
//
//        }
//
//        return (T) top.data;
//    }



    public T pop(){
        Node temp = top;
        if(!this.isEmpty()){
            top = top.next;
            temp.next = null;

            return (T) temp.data;
        }
        return null;
    }


    public T peek()
    {

        if (!isEmpty()) {

            return (T) top.data;
        }
        else {
           System.out.println("Stack is empty");

        }

        return null;
    }


    public boolean isEmpty()
    {

        return top == null;
    }


}
