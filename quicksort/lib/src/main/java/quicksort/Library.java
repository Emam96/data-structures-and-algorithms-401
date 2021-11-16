/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quicksort;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static void main(String[] args) {

        int[] arr = {8, 4, 23, 42, 16, 15};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        print(arr);

    }


    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];


        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (arr[j] < pivot) {

                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }


    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void print(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    static int[] printToTest(int arr[])
    {

        int n = arr.length;
        int[] results = new int[n];
        for (int i = 0; i < n; ++i)
        results[i] = arr[i];

        return results;
    }

}