package DSA.DP;

//1. Get Maximum in Generated Array  :- url = https://www.codebattle.in/editor/6ffd8d77-800e-4d47-8abb-6c5374a52f50
//        Easy
//You are given an integer n. An array nums of length n + 1 is generated in the following way:
//
//nums[0] = 0
//nums[1] = 1
//nums[2 * i] = nums[i]` when 2 <= 2 * i <= n
//nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
//Return *the maximum integer in the array nums.
//
//        Example 1:
//
//        7
//Input
//3
//Output
//Explaination:
//
//The generated array nums is [0, 1, 1, 2, 1, 3, 2, 3]. The maximum integer in the array is 3.
//
//Constraints:
//
//        0 <= n <= 100
//Input Format:
//
//An integer n.
//
//Output Format:
//
//An integer representing the maximum integer in the generated array nums.




public class getMaximumGeneratedClass {

    public int getMaximumGenerated(int n) {
        if (n == 0) return 0;

        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;

        // DP fill karte jaenge recursion se
        for (int i = 2; i <= n; i++) {
            generate(nums, i);
        }

        // Max find
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    private int generate(int[] nums, int i) {
        if (nums[i] != 0 || i == 0) return nums[i];  // memoization or base

        if (i % 2 == 0) {
            nums[i] = generate(nums, i/2);
        } else {
            nums[i] = generate(nums, i/2) + generate(nums, i/2 + 1);
        }
        return nums[i];
    }
}
