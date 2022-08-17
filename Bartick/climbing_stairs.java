// https://leetcode.com/problems/climbing-stairs/

class Solution {
    public int climbStairs(int n) {
        int pre = 1, curr = 1, temp = 0;
        
        for(int i=1; i<n; i++) {
            temp = curr;
            curr = temp+pre;
            pre = temp;
        }
        return curr;
    }
}
