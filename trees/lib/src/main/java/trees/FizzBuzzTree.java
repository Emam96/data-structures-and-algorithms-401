package trees;

public class FizzBuzzTree {

    private static void fizzProcess(Node current) {
        if (current != null) {
            fizzProcess(current.left);
            if ((Integer)current.value % 15 == 0) {
                current.value="FizzBuzz";
            } else if ((Integer)current.value % 5 == 0) {
                current.value="Buzz";
            } else if ((Integer)current.value % 3 == 0) {
                current.value="Fizz";
            }
            System.out.println(current.value);
            fizzProcess(current.right);
        }
    }


    public static BinaryTree fizzBuzzTree(BinaryTree tree) {
        fizzProcess(tree.root);
        return tree;
    }




}
