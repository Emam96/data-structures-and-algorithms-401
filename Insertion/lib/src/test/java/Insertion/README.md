# Challenge Summary

Insertion Sort

## Whiteboard Process

![sort](https://i.imgur.com/d1QJ6nW.jpeg)

## Approach & Efficiency

Time Complexity: O(n^2)<br>
Space Complexity: O(1)
* Reverse-sorted takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are

## Solution

```
 InsertionSort(int[] arr)

    FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp
```