# Merge Sort

## Overview
- Merge Sort is the act of sorting a list of items by breaking the collection into the it's smallest pieces and then merging it back together all the while sorting as it's being reassembled.
- It takes 2 loops to perform an insertion sort which leaves it at an O(n<sub>log n</sub>) time complexity.
- It can be performed in place which leaves it at a O(n) space complexity.

## How it works.

- First we start recursively splitting the collection in half until it can no longer be split.
- Then we stitch the collection back together all the while sorting all the way back up.

## PseudoCode
```
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left

```


## Visualization
![Start](https://1.bp.blogspot.com/-JiSHDehan4g/XwdeN0oDdbI/AAAAAAAACkw/PLSrxXHBOWIISkIcNVZCIu4KwJWw2DjCgCK4BGAsYHg/s730/merge-sort-in-java.jpg)







### Tracing

Lets go step by step with the merging sort
![Start](https://miro.medium.com/max/2400/1*5IRuEb66d0On0Vf36YVl-A.png)

1. The Merge Sort algorithm starts recursively dividing the array into n/2 sub-arrays. After the first division, the array is divided into 2 sub-arrays.
![Start](https://miro.medium.com/max/2400/1*4Hrb1GSEUraJ2PZBCCJ-WA.png)

2. The algorithm continues to divide the sub-arrays. Both the left and right sub-arrays are divided, and the algorithm generates four new sub-arrays.
    ![Start](https://miro.medium.com/max/2400/1*XbgwhexFaeD8ZBRKKsLkvg.png)

3. There is one final division that must be done on all four sub-arrays to create eight individual elements.
   ![Start](https://miro.medium.com/max/2400/1*KwqZao0ulzGotdcz3Vz9lQ.png)

4. elements 0 and 1 are compared. Since 35 is larger than 12, element 1 is added first into the new sub-array followed by 35.
   ![Start](https://miro.medium.com/max/2400/1*lF1CDJ3UyCS-4YnSFk_dsg.png)

5. Next, the algorithm compares values at indices 2 and 3. Since 24 is less than 29, 24 is added to the new sub-array first, followed by 29.
   ![Start](https://miro.medium.com/max/2400/1*tEU3CArvBwSg2k_hdMfbaQ.png)

6. Finally, values at indices 6 and 7 are compared. Since 3 is less than 45, 3 is added first to the subarray.
   ![Start](https://miro.medium.com/max/2400/1*9k6lVaveObax235OOmGf8w.png)

7. The index value of the left array is incremented and 35 is compared to 45. Since 35 is less than 45, 35 is added next followed by 45.
   ![Start](https://miro.medium.com/max/2400/1*HvEJzeZ9Q6QClt_nnasU3Q.png)

## Detailed Explanation
- Start by splitting the list in half.
    - then recursively call MergeSort again which splits that half into another half.
    - Do that for both sides till there are no way of splitting the list any longer.
- Then each broken up part of the list gets sent through the MergeSort method that has the 3 parameter Overload.
    - In this method we stitch each portion together by
        - placing the items portion left of the bigger items.
    - as each method pops off the call stack it the new sorted array gets sent through the 3 parameter merge sort again until the call stack is completely empty.

    