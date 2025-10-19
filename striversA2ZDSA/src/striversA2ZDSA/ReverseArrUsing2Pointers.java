package striversA2ZDSA;

public class ReverseArrUsing2Pointers {

    // recursive function to reverse array
    static void reverse(int[] arr, int left, int right) {
        // base case: when pointers cross or meet
        if (left >= right) {
            return;
        }

        // swap elements
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // recursive call with narrowed range
        reverse(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        reverse(arr, 0, arr.length - 1);

        System.out.println("\nReversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
