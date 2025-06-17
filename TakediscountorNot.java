/*
Take discount or Not

There are N items in a shop. You know that the price of the i-th item is A[i].
Chef wants to buy all the N items.

There is also a discount coupon that costs X rupees and reduces the cost of
every item by Y rupees. If the price of an item was initially ≤ Y, it becomes
free, i.e., costs 0.

Determine whether Chef should buy the discount coupon or not. Chef will buy
the discount coupon if and only if the total price he pays after buying the
discount coupon is strictly less than the price he pays without buying the
discount coupon.

Input Format:
- The first line contains an integer T, the number of test cases.
- For each test case, two lines:
  - First line: N X Y
  - Second line: N space-separated integers A1, A2, ..., AN

Output Format:
Print "COUPON" if Chef should buy it, else "NO COUPON".

Constraints:
1 ≤ T ≤ 1000
1 ≤ N ≤ 100
1 ≤ X, Y ≤ 10^5
1 ≤ Ai ≤ 10^5
*/
import java.util.Scanner;

public class TakediscountorNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] a = new int[n];
            int total_discount = 0;
            int without_discount = 0;

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
             for(int i = 0; i < n; i++){
                total_discount += Math.max(0, a[i] - y);
             }
               total_discount += x;

             for(int i = 0; i < n; i++){
                without_discount += a[i];
             }

             if(total_discount<without_discount)
                 System.out.printf("COUPON\n");


             else
              System.out.println("NO COUPON");
        }
    }
}
