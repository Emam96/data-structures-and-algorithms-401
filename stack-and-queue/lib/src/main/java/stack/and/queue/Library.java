/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

public class Library {

    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push("10");
        s.push("20");
        s.push("30");
        s.push("40");
        s.push("50");
        s.peek();
        s.pop();
        s.peek();


Queue q = new Queue();

        q.enqueue("emam");
        q.enqueue("hadi");


     System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());

        System.out.println( q.peek());


    }


}
