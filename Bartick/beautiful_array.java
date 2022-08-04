// https://leetcode.com/problems/beautiful-array/

class Solution {
    public int[] beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        while(ans.size() < n) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int ele: ans) if(2*ele-1 <= n) temp.add(2*ele-1);
            for(int ele: ans) if(2*ele <= n) temp.add(2*ele);
            ans = temp;
        }
        int[] finalAnswer = new int[n];
        for(int i=0; i<n; i++) finalAnswer[i] = ans.get(i);
        return finalAnswer;
    }
}
