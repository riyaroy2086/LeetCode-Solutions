// https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/submissions/856307460/

class Solution {
    public int minInsertions(String s) {
        return s.length() - palindrome(s);
    }

    public int palindrome(String s){
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; ++i)
          dp[i][i] = 1;

         for (int d = 1; d < n; ++d)
            for (int i = 0; i + d < n; ++i) {
                final int j = i + d;
                if (s.charAt(i) == s.charAt(j))
                dp[i][j] = 2 + dp[i + 1][j - 1];
                else
                dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
            }

            return dp[0][n - 1];

    }
}
