package trees;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Ktree<T> {
    Knode root=null;
    int nodesnum = 0;
    int K=0;


    public Ktree(int k) {
        if(k<=1)
            k=2;
        this.K = k;
    }

    public boolean isEmpty() {

        return root == null;
    }

    public boolean isNotEmpty(){
        return root != null;
    }

    public void add(T value){
        nodesnum++;
        Knode newNode = new Knode(value);
        if( isEmpty()){
            root = newNode;
            return;
        }
        Queue<Knode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){

            Knode currentNode = queue.poll();
            if(currentNode.children.size() < this.K){
                currentNode.addChild(newNode);
                return;
            }
            else {
                queue.addAll(currentNode.children);
            }
        }
    }

    public List<T> breadthFirstSearch(){
        List <T> kAryTree = new ArrayList<>();
        Queue<Knode> queue = new LinkedList<>();
        if(isNotEmpty()){
            queue.add(root);
            while(!queue.isEmpty()){

                Knode currentNode = queue.poll();
                kAryTree.add((T)currentNode.value);

                if(! currentNode.children.isEmpty())
                    queue.addAll(currentNode.children);
            }
        }
        return kAryTree;
    }


    public int getSize(){
        return nodesnum;
    }

    public static Ktree<String> fizzBuzzTree(Ktree<Integer> kTree){
        Ktree<String> outTree = new Ktree(kTree.K);

        Queue<Knode> queue = new LinkedList<>();
        if(kTree.isNotEmpty()){
            queue.add(kTree.root);
            while(!queue.isEmpty()){

                Knode<Integer> currentNode = queue.poll();

                String currentValue="";
                if(currentNode.value % 3 == 0 && currentNode.value % 5 ==0 )
                    currentValue = "FizzBuzz";
                else if(currentNode.value % 3 == 0)
                    currentValue="Fizz";
                else if(currentNode.value % 5 == 0)
                    currentValue="Buzz";
                else
                    currentValue=currentNode.value.toString();

                outTree.add(currentValue);

                if(! currentNode.children.isEmpty())
                    queue.addAll(currentNode.children);
            }
        }
        return outTree;
    }
}
