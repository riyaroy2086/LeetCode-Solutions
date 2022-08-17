// https://leetcode.com/problems/edit-distance/

class Solution {
    private int min(int a, int b, int c) {
        return Math.min(a, Math.min(b,c));
    }
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();

        int[] dp = new int[n + 1];

        for(int j = 0; j <= n; j++) {
            dp[j] = j;
        }

        for(int i = 1; i <= m; i++) {
            int[] newDp = new int[n + 1];
            newDp[0] = i;
            for(int j = 1; j <= n; j++) {
                if(word1.charAt(i - 1) == word2.charAt(j - 1))
                    newDp[j] = dp[j - 1];
                else
                    newDp[j] = min(dp[j - 1] + 1, dp[j] + 1, newDp[j - 1] + 1);
            }
            dp = newDp;
        }
        return dp[n];
    }
}
