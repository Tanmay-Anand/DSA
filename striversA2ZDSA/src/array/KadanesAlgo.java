package array;

public class KadanesAlgo {

    // Function to find the maximum sum of a contiguous subarray
    // using Kadane's Algorithm
    public static long maxSubarraySum(int[] arr, int n) {

        long maxi = Long.MIN_VALUE; // stores the maximum subarray sum found so far
        long sum = 0;               // tracks the current subarray sum as we iterate

        // Traverse the entire array once
        for (int i = 0; i < n; i++) {

            // Add the current element to the running sum
            sum += arr[i];

            // Update maxi if the current running sum is greater than the previous maximum
            if (sum > maxi) {
                maxi = sum;
            }

            // If the running sum becomes negative, reset it to 0.
            // The reason: a negative sum will only reduce the total of any future subarray.
            // So we discard it and start fresh from the next element.
            if (sum < 0) {
                sum = 0;
            }
        }

        // Optional case:
        // If you want to handle the situation where all numbers are negative
        // and the maximum subarray should be 0 (an empty subarray),
        // uncomment the following line:
        //
        // if (maxi < 0) maxi = 0;

        return maxi; // Return the largest subarray sum found
    }

    public static void main(String args[]) {

        // Example array containing both positive and negative integers
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        // Store the array length for convenience
        int n = arr.length;

        // Call Kadane's Algorithm to compute the maximum subarray sum
        long maxSum = maxSubarraySum(arr, n);

        // Print the result to the console
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
