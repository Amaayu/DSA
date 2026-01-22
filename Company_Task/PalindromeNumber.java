package Company_Task;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }

        if (original == reverse)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome");
    }
}
