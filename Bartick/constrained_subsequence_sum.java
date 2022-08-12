// https://leetcode.com/problems/constrained-subsequence-sum/

class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
    int[] dp = new int[nums.length];
    Deque<Integer> q = new ArrayDeque<>();

    for (int i = 0; i < nums.length; ++i) {
      if (q.isEmpty())
        dp[i] = nums[i];
      else
        dp[i] = Math.max(q.peekFirst(), 0) + nums[i];
      while (!q.isEmpty() && q.peekLast() < dp[i])
        q.pollLast();
      q.offerLast(dp[i]);
      if (i >= k && dp[i - k] == q.peekFirst())
        q.pollFirst();
    }

    return Arrays.stream(dp).max().getAsInt();
  }
}
