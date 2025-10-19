package striversA2ZDSA;

import java.util.Scanner;

public class HashingCountingNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter " + n + " elements (0–12):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Hash array for counting frequency of numbers 0–12
        // Adjust the size if input can be larger
        int[] frequency = new int[13];

        // Count frequency of each number in the input array
        for (int num : arr) {
            if (num >= 0 && num < frequency.length) {
                frequency[num]++;
            } else {
                System.out.println("Warning: " + num + " is out of valid range (0–12)");
            }
        }

        // Handle queries
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        System.out.println("Enter " + q + " numbers to query their frequency:");
        while (q-- > 0) {
            int number = sc.nextInt();

            // Check if query is within valid range
            if (number >= 0 && number < frequency.length) {
                System.out.println("Count of " + number + " = " + frequency[number]);
            } else {
                System.out.println(number + " is out of valid range (0–12)");
            }
        }

        sc.close();
    }
}
