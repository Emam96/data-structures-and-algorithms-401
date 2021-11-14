
package Insertion;

public class Library {
    public static void main(String[] args) {

      int arr[] = {8,4,23,42,16,15};

//      print(arr);
//
//     sort(arr);
//
//        print(arr);

        int reversed[] = {20, 18, 12, 8, 5, -2};
        int nearly[] = {2, 3, 5, 7, 13, 11};
        int unique[]= {5, 12, 7, 5, 5, 7};

        sort(reversed);
        sort(nearly);
        sort(unique);

        System.out.println( print(reversed));
//        print(nearly);
//        print(unique);



    }



    static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static String print(int arr[])
    {
        String result = " ";
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + result);

       return result;
    }


}
