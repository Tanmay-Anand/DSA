package sorting;

public class SelectionSort1 {

    public int[] sortmeth(int n, int[] arr) 
    {
        for (int i = 0; i < n - 1; i++) 
        {
            int mini = i; // find index of smallest element
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[j] < arr[mini]) 
                {
                    mini = j;
                }
            }
            // swap once per outer loop
            swap(arr, i, mini);
        }
        return arr;
    }

    public void swap(int[] arr, int i, int mini) 
    {
        int temp = arr[i];
        arr[i] = arr[mini];
        arr[mini] = temp;
    }

    public static void main(String[] args) 
    {
        SelectionSort1 obj = new SelectionSort1();
        int[] arr = {2, 5, 4, 1, 3};
        int n = arr.length;
        obj.sortmeth(n, arr);

        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
    }
}
