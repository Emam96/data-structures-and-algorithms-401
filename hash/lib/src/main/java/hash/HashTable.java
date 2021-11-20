package hash;

import java.util.ArrayList;

public class HashTable<K, V> {


    private static final double loadThreshold = 0.7;
    private ArrayList<Bucket> bucketArray;

    private int numBuckets;
    private int size;
    public HashTable() {
        bucketArray = new ArrayList<>();
        numBuckets = 10;
        size = 0;

        for (int i = 0; i < numBuckets; i++) {
            bucketArray.add(null);
        }
    }



    public void add(K key, V value) {
        int bucketIndex = hash(key);
        Bucket head = bucketArray.get(bucketIndex);


        // handling collisions
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                System.out.println(key+" value changed to "+ value);
                return;
            }
            head = head.next;
        }

        size++;
        head = bucketArray.get(bucketIndex);
        Bucket newNode = new Bucket(key, value);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);
        if ((1.0 * size) / numBuckets >= loadThreshold) {
            ArrayList<Bucket> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;
            for (int i = 0; i < numBuckets; i++) {
                bucketArray.add(null);
            }
            for (Bucket headNode : temp) {
                while (headNode != null) {
                    add((K) headNode.key,(V) headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }




    public V get(K key) {
        int bucketIndex = hash(key);
        Bucket head = bucketArray.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return (V) head.value;
            }
            head = head.next;
        }
        System.out.println("No data found");
        return null;
    }



    public boolean contain(K key) {
        int bucketIndex = hash(key);
        Bucket head = bucketArray.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return true;
            }
            head = head.next;
        }
        System.out.println("No data found");
        return false;
    }




    public int hash(K key) {
        int hashCode = key.hashCode();
        return hashCode % numBuckets;
    }



}



