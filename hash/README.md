# Hashtables

Hashtable implementation using Java.

## Challenge

This directory includes two classes, one for a bucket in the table and one for the hashing methods itself.

## Approach & Efficiency

- Hash table lookups are O(1) searching for the element takes the same amount of time as searching for the first element of an array, which is a constant time in the average case, However, if our dataset is bigger than the hash table collisions occur and we need to deal with them using different methods, O(n) in the worst case.
-The space complexity of every  hash table is O(n), the datastructure always fill constant space no matter how many elements it contains.

## API

` HashTable table = new HashTable();`


- add()
Arguments: key, value
Returns: nothing
This method should hash the key, and add the key and value pair to the table, handling collisions as needed.<br>
` table.add(10, 36);` it will add the pair to the table.

- get()
Arguments: key
Returns: Value associated with that key in the table<br>
  ` table.get(10);` returns `36`.


- contain()
Arguments: key
Returns: Boolean, indicating if the key exists in the table already.<br>
  ` table.contain(10);` returns `true`.


- hash()
Arguments: key
Returns: Index in the collection for that key
