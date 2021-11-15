
package MergeSort;

public class Library {
    public static void main(String[] args) {

        int[] arr = { 5, 1, 6, 2, 3, 4 };
        int[] arr1 = {8, 4, 23, 42, 16, 15};
        mergeSort(arr1);
        print(arr1);

    }


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



    static void print(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


}
