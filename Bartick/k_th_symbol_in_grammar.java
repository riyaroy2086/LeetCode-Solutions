// https://leetcode.com/problems/k-th-symbol-in-grammar/

class Solution {
    public int kthGrammar(int n, int k) {
        return Integer.bitCount(k-1) & 1;
    }
}
