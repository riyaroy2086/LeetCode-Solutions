// https://leetcode.com/problems/predict-the-winner/

class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int[][] gain = new int[nums.length][nums.length];
        for (int k = 0; k < nums.length; k ++) {
            for (int i = 0; i + k < nums.length; i ++) {
                if (k == 0) {
                    gain[i][i + k] = nums[i];
                }
                else if (k == 1) {
                    gain[i][i + k] = Math.abs(nums[i] - nums[i + k]);
                }
                else {
                    gain[i][i + k] = Math.max(gain[i][i] - gain[i + 1][i + k], gain[i + k][i + k] - gain[i][i + k - 1]);
                }
            }
        }
        return gain[0][nums.length - 1] >= 0;
    }
}
