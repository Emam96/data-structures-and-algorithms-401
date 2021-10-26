package stack.and.queue;

public class StackedQueue {

    static Stack stackOne = new Stack();
    static Stack stackTwo = new Stack();

    public void enqueue(String x)
    {
        while (!stackOne.isEmpty())
        {
            stackTwo.push(stackOne.pop());
        }

        stackOne.push(x);

        while (!stackTwo.isEmpty())
        {
            stackOne.push(stackTwo.pop());
        }
    }


   public   String dequeue()
    {
        if (stackOne.isEmpty())
        {
            System.out.println("Queue is empty");
            System.exit(0);
        }

        String x = (String) stackOne.peek();
        stackOne.pop();
        return x;
    }

}
