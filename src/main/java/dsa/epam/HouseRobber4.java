package dsa.epam;

public class HouseRobber4 {


    /*
      this recursion is working well but i need to optimize it more
      by using the memoization technique using the dynamic programming
     */
    public int minCapability(int[] nums, int k) {

        return helper(nums, 0, k);

    }
    public int helper(int nums[], int i, int k) {

        if(k == 0) return Integer.MIN_VALUE;

        if(i >= nums.length) {
            return Integer.MAX_VALUE;
        }

        // take
        int take = Math.max(nums[i], helper(nums, i + 2, k - 1));

        // not take
        int not = helper(nums, i + 1, k);

        return Math.min(take, not);
    }

    static class memoize {

        Integer dp[][];

        public int minCapability(int[] nums, int k) {
            dp = new Integer[nums.length][k + 1];
            return helper(nums, 0, k);

        }
        public int helper(int nums[], int i, int k) {

            if(k == 0) return Integer.MIN_VALUE;

            if(i >= nums.length) {
                return Integer.MAX_VALUE;
            }

            if(dp[i][k] != null) return dp[i][k];

            // take
            int take = Math.max(nums[i], helper(nums, i + 2, k - 1));

            // not take
            int not = helper(nums, i + 1, k);

            return dp[i][k] = Math.min(take, not);
        }
    }
}
