package stack.and.queue;



public class Stack {

    Node top;

    Stack()
    {
        this.top = null;
    }


    public void push(String data)
    {
        Node temp = new Node(data);
        temp.data = data;
        temp.link = top;
        top = temp;
        System.out.println(data + " placed on top");
    }


    public void pop()
    {

        if (!isEmpty()) {
            System.out.println( top.data + " Removed from top");
            top = (top).link;

        } else {

            System.out.println("Stack is empty");

        }



    }



    public String peek()
    {

        if (!isEmpty()) {

            return top.data;
        }
        else {
          return   "Stack is empty";

        }
    }


    public boolean isEmpty()
    {
        return top == null;
    }


}
