
class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if (Math.abs(target) > sum) {
            return 0;
        }

        int[][] dp = new int[nums.length + 1][2 * sum + 1];

        dp[0][sum] = 1;

        for (int i = 1; i <= nums.length; i++) {

            int num = nums[i - 1];

            for (int j = 0; j <= 2 * sum; j++) {

                if (dp[i - 1][j] > 0) {

                    dp[i][j + num] += dp[i - 1][j];

                    dp[i][j - num] += dp[i - 1][j];
                }
            }
        }

        return dp[nums.length][target + sum];
    }
}
