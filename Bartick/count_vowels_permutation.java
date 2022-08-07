// https://leetcode.com/problems/count-vowels-permutation/

class Solution {
    private static final int MOD = (int)Math.pow(10,9) + 7;
    public int countVowelPermutation(int n) {
        long[][] dp = new long[n + 1][5];
        Arrays.fill(dp[1], 1);
   
        for (int i = 2; i <= n; i++) {
            dp[i][0] = (dp[i - 1][1] + dp[i - 1][2] + dp[i - 1][4]) % MOD;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
            dp[i][2] = (dp[i - 1][1] + dp[i - 1][3]) % MOD;
            dp[i][3] = dp[i - 1][2];
            dp[i][4] = (dp[i - 1][2] + dp[i - 1][3]) % MOD;
        }
        long ans = 0L;
        for (int i = 0; i < 5; i++) {
            ans = (ans + dp[n][i]) % MOD;
        }
        return (int)ans;
    }
}
