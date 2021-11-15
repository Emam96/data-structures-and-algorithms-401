# Challenge Summary
## Merge Sort

Merge Sort is the act of sorting a list of items by breaking the collection into the it's smallest pieces and then merging it back together all the while sorting as it's being reassembled.

## Whiteboard Process

![mrge](https://i.imgur.com/m9WYYUA.jpeg)


 [BLOG](BLOG.md)
## Approach & Efficiency

- It takes 2 loops to perform an insertion sort which leaves it at an O(n<sub>log n</sub>) time complexity.
- It can be performed in place which leaves it at a O(n) space complexity.

## Solution
``````
public static void mergeSort(int[] a) {
if (a.length < 2) {
return;
}
int mid = a.length / 2;
int[] l = new int[mid];
int[] r = new int[a.length - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < a.length; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l);
        mergeSort(r);

        merge(a, l, r, mid, a.length - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }




