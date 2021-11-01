package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree <T> {


    Node root;

    BinaryTree()
    {
        root = null;
    }

    public boolean isEmpty() {
        if (root != null){
            return  false;
        } else {
            System.out.println("Tree is empty!");
            return true;
        }
    }

    public void getRoot() {
        if (root != null){
            System.out.println(root.value);
        } else {
            System.out.println("Tree is empty!");
        }

    }

    public List<Integer> preOrder(Node node) {
     List<Integer> list = new ArrayList<>();
        if (node != null) {
//            System.out.print(" " + node.value);
            list.add(node.value);

            if (node.left != null)
                list.addAll(preOrder(node.left));
            if (node.right != null)
                list.addAll(preOrder(node.right));


//            preOrder(node.left);
//            preOrder(node.right);

        }
            return list;
    }


    public List<Integer> inOrder(Node node) {
        List<Integer> list = new ArrayList<>();
        if (node != null) {
            if (node.left != null)
                list.addAll(preOrder(node.left));
            list.add(node.value);
            if (node.right != null)
                list.addAll(preOrder(node.right));
        }
        return list;
    }


    public List<Integer> postOrder(Node node) {
        List<Integer> list = new ArrayList<>();
        if (node != null) {
            if (node.left != null)
                list.addAll(preOrder(node.left));
            if (node.right != null)
                list.addAll(preOrder(node.right));
            list.add(node.value);
        }
        return list;
    }





//    ALGORITHM breadthFirst(root)
// INPUT  <-- root node
// OUTPUT <-- front node of queue to console

//    Queue breadth <-- new Queue()
//  breadth.enqueue(root)

//            while breadth.peek()
//    node front = breadth.dequeue()
//    OUTPUT <-- front.value
//
//    if front.left is not NULL
//      breadth.enqueue(front.left)
//
//            if front.right is not NULL
//      breadth.enqueue(front.right)


//    void printPostorder() {
//        if (root != null){
//       postOrder(root);
//    } else {
//        System.out.println("Tree is empty!");
//    }
//    }
//    void printInorder() {
//        if (root != null){
//        inOrder(root);
//    } else {
//        System.out.println("Tree is empty!");
//    }
//    }
//    void printPreorder() {
//        if (root != null){
//            System.out.println(preOrder(root));
//    } else {
//        System.out.println("Tree is empty!");
//    }
//    }

}
