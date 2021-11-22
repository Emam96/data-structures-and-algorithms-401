# Challenge Summary

Find common values in 2 binary trees using hash table.

## Whiteboard Process

![tree](https://i.imgur.com/e03ZEri.jpeg)

## Approach & Efficiency

- time => O(N ) For time due to the for loop
- space => O(N)

## Solution

````

 public static List treeIntersection(Tree tree1, Tree tree2) {


        List treeOne = tree1.inOrder(tree1.root);
        List treeTwo = tree1.inOrder(tree2.root);

        List results = new ArrayList<>();
        HashTable hashtable = new HashTable();

        for (int i = 0; i < treeOne.size(); i++) {
            hashtable.add(treeOne.get(i),i);

            if (hashtable.contain(treeTwo.get(i))){
                results.add(treeTwo.get(i));

            }


        }
        return  results;

    }