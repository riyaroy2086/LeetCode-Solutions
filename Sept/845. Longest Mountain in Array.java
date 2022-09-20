// https://leetcode.com/submissions/detail/804718839/

class Solution {
    public int longestMountain(int[] arr) {
        int ans = 0, n = arr.length;
        for (int i = 0; i+1 < n;) {
            while (i + 1 < n && arr[i] == arr[i + 1]) {

                i++;
            }
            
            int up = 0, dn = 0;
            
            while (i + 1 < n && arr[i] < arr[i + 1]) {
                up++;
                i++;
            }
            while (i + 1 < n && arr[i] > arr[i + 1]) {
                dn++;
                i++;
            }


            if (up > 0 && dn > 0) {
                ans = Math.max(ans, up + dn + 1);
            }

        }
        return ans;
    }
}
