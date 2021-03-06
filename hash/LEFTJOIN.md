# Left Join

Implement a simplified LEFT JOIN for 2 Hashmaps.

## Challenge

Write a function that LEFT JOINs two hashmaps into a single data structure.


## WhitBoard
 
![left](https://i.imgur.com/NjrhmK7.jpeg)

## Approach & Efficiency

Create a method that accepts 2 hash maps as a parameter. Declare a list and iterate through each hashmap and compare
the keys if it matches. If each hash map has the same key, then add the key and values to the list, otherwise add to
list with the second hash map value to null.

the big O notation of the function is : time complexity = O(n) because we use a loop. space complexity = O(n) because we declared a List.

## Solution

````
 public static List<String> leftJoin(HashMap h1, HashMap h2){

        List<String> list = new ArrayList<>();
        for(Object k : h1.keySet()){
            if(h1.containsKey(k)){
                list.add(k +  ": " + h1.get(k)+ ", " + h2.get(k));
            } else{
                list.add(k + ": " + h1.get(k) + ", " + null);
            }
        }

        return list;


    }
````





