package sorting;

public class BubbleSort1 {
    public int[] sortmeth(int n, int[] arr) {
        for (int i = n - 1; i >= 1; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    didSwap = 1;
                }
            }
            // If no swaps were made, array is already sorted
            if (didSwap == 0) {
                break;
            }
        }
        return arr;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        BubbleSort1 obj = new BubbleSort1();
        int[] arr = {2, 5, 4, 1, 3};
        int n = arr.length;
        obj.sortmeth(n, arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
