package striversA2ZDSA;

import java.util.Scanner;

public class HashingCharFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input string
        System.out.print("Enter a lowercase string: ");
        String input = sc.next();

        // Frequency array for lowercase English letters (a–z)
        int[] frequency = new int[26];

        // Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Only count lowercase letters
            if (ch >= 'a' && ch <= 'z') {
                frequency[ch - 'a']++;
            } else {
                System.out.println("Warning: '" + ch + "' is not a lowercase letter. Ignored.");
            }
        }

        // Handle queries
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        System.out.println("Enter " + q + " lowercase characters to query their frequency:");
        while (q-- > 0) {
            char queryChar = sc.next().charAt(0);

            if (queryChar >= 'a' && queryChar <= 'z') {
                System.out.println("Count of '" + queryChar + "' = " + frequency[queryChar - 'a']);
            } else {
                System.out.println("'" + queryChar + "' is not a lowercase letter.");
            }
        }

        sc.close();
    }
}
