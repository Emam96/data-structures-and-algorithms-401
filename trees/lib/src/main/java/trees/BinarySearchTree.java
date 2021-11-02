package trees;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree <T> extends  BinaryTree {






    //////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////


    private Node addToTree(Node<Integer> current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if ( value <  current.value) {
            current.left = addToTree(current.left, value);
        } else if (value > current.value) {
            current.right = addToTree(current.right, value);
        } else {

            return current;
        }

        return current;
    }

    public void add(int value) {
        root = addToTree(root, value);
    }

    //////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////

    private boolean containsNode(Node<Integer> current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNode(current.left, value)
                : containsNode(current.right, value);
    }

    public boolean contain(int value) {
        return containsNode(root, value);
    }


    //////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////

    private int findMax(Node<Integer> node)
    {
        if (node == null) {
            System.out.println("Tree is empty");
            return 0;
        }
            int res = node.value;
            int lres = findMax(node.left);
            int rres = findMax(node.right);

            if (lres > res)
                res = lres;
            if (rres > res)
                res = rres;
            return res;

    }


public int max(){

  return   findMax(root);

}

    //////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////




}


