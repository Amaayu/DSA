package DSA.Recursion;

//Given a number n, find the value of n raised to the power of its own reverse.
//Note: The result will always fit into a 32-bit signed integer.
//   url = https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1
//        Examples:
//
//Input: n = 2
//Output: 4
//Explanation: The reverse of 2 is 2, and 22 = 4.
//Input: n = 10
//Output: 10
//Explanation: The reverse of 10 is 1 (leading zero is discarded), and 10 raised to the power 1 is 10.
//Constraints:
//        1 ≤ n ≤ 10




public class reverseExponentiationClass {
    public int reverseExponentiation(int N , int R) {
        if (R==1) return N;
        return N * reverseExponentiation(N, R-1);
    }

    public static void main(String[] args) {
        reverseExponentiationClass obj = new reverseExponentiationClass();
        int N = 3; // Base
        int R = 4; // Exponent
        int result = obj.reverseExponentiation(N, R);
        System.out.println("The result of " + N + " raised to the power of " + R + " is: " + result);
    }
}
