// https://leetcode.com/problems/task-scheduler/

class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map=new HashMap<Character, Integer>();
        int fre = 0, ans = 0;
        for(int i=0; i<tasks.length; i++) {
            if (map.containsKey(tasks[i])) {
                map.put(tasks[i], map.get(tasks[i])+1);
            }
            else {
                map.put(tasks[i], 1);
            }
            fre = Math.max(map.get(tasks[i]), fre);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue()==fre) {
                ans++;
            }
        }
        return Math.max(tasks.length, ans + (fre-1)*(n+1));
    }
}
