package striversA2ZDSA;

//Input: n = 153
//Output: true
//Explanation: Number of digits : 3.
//13 + 53 + 33 = 1 + 125 + 27 = 153.
//Therefore, it is an Armstrong number.

public class Armstrong 
{
    public boolean isArmstrong(int n) {
        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Armstrong arm = new Armstrong();
        System.out.println(arm.isArmstrong(153)); // true
        System.out.println(arm.isArmstrong(123)); // false
    }
}

