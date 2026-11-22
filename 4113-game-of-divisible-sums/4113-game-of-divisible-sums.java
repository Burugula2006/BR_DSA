class Solution {
    public long maxDifference(int[] nums) {
        int n = nums.length;
        Long[] dp = new Long[n];

        return f(0, nums, dp);// start with oth index of nums 
    }

    public long f(int i, int[] nums, Long[] dp) {
        if (i == nums.length) {
            return 0;
        }

        if (dp[i] != null)
            return dp[i];

        // Take one element
        long sum = nums[i];

        long one = sum % 3 == 0? sum - f(i + 1, nums, dp): sum + f(i + 1, nums, dp);

        dp[i] = one;

        // Take two elements
        if (i < nums.length - 1) {
            sum = (long) nums[i] + nums[i + 1];

            long two = sum % 3 == 0
                    ? sum - f(i + 2, nums, dp)
                    : sum + f(i + 2, nums, dp);

            dp[i] = Math.max(dp[i], two);// state represents maximum value till now taking consideration of picking one or two elemnts from the left 
        }

        return dp[i];
    }
}