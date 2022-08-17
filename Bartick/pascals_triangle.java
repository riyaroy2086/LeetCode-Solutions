// https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows==0) return ans;
        List<Integer> temp = new ArrayList<Integer>();
        int size=1;
        for(int i=0;i<numRows;i++){
            temp.add(0,1);
            for(int j=1;j<temp.size() - 1 ;j++) temp.set(j,temp.get(j)+temp.get(j+1));
            ans.add(new ArrayList<Integer>(temp));
        }
        return ans;
    }
}
