class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        if(n<= 2){
            return n;
        }
        dp[n] = 1;
        dp[n-1] = 1;
        for(int j = n-2; j>=0 ; j--){
            dp[j] = dp[j+1]+dp[j+2];
        }
        return dp[0];
    }
}
