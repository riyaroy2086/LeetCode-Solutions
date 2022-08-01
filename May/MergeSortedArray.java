class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c = 0; //taking count = 0
        for(int i=m;i<(m+n);i++){ // initialising with all the elements in any of the two arrays and 
                                // now traversing another to find out if any unique element exists
            for(int j=c;j<(n);j++){ // not to include if same element exists
                    nums1[i] = nums2[j];
                    c++;
                    break;     
            }
        } Arrays.sort(nums1); // in ascending order after merging
    }
}