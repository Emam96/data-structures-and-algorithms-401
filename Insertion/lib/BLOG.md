# Insertion Sort

## Overview
- Quick Sort is the act of sorting a list of items by picking 1 item as a pivot and comparing it to the rest of the items. Each time an item is less than the pivot we swap locations with a known larger item.
    - we keep doing this recursively until all items are in their correct spot.


    
## PseudoCode
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



## Visualization
![Start](https://static.studytonight.com/data-structures/images/basic-insertion-sort.png)





## Detailed Explanation
- Start by seeing if the left most item is smaller than the right most item.
    - If it is then start by running the first partition method
- The Partition method takes 3 parameters
    - The array, the left most position, and the right most position.
- In the Partition Method
    - Define the right most position as the pivot
    - Define the left most position - 1 as the lowest point
    - Start a for loop that starts at the lowest position and runs till the highest position.
        - Check to see if the array at the current loop position is less than the pivot
            - If it is
                - increment low
                - swap array at position low with current loop position.
            - Keep doing this till the loop ends.
        - Swap the Pivot with the item that is at it's correct position.
- All these steps get called recursively until all items are in their correct position.


## Efficency 

Time Complexity: O(n^2)<br>
 Space Complexity: O(1)
* Reverse-sorted takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.