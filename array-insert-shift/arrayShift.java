import java.util.Arrays;

public class arrayShift {

    public static void main(String[] args) {

        int n = 16;

        int arr[] = { 42, 8, 15, 23, 42 };

        System.out.println(Arrays.toString(arr));

        arr = insertShiftArray(n, arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] insertShiftArray(int n, int arr[]) {

        ///////////////////////////////////////////

        int newArr[] = new int[arr.length+1];
        int middle = Math.abs(arr.length / 2);

        for (int i = 0; i < arr.length+1; i++) {
            if (i < middle) {
                newArr[i] = arr[i];
            }
            if (i == middle) {
                newArr[i] = n;
            } else if (i > middle) {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;

    }

}