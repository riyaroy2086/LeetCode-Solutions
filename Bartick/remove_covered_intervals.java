// https://leetcode.com/problems/remove-covered-intervals/

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (Integer.compare(a[0], b[0])));
        int left = -1, right = -1, count = 0;
        for (int[] inter : intervals) {
            if (inter[0] > left && inter[1] > right) {
                left = inter[0];
                count += 1;
            }
            right = Math.max(right, inter[1]);
        }
        return count;
    }
}
