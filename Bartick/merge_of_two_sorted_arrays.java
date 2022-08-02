// https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArr = new int[nums1.length+nums2.length];
        int i, j, k;
        i = j = k = 0;
        
        while(i<nums1.length && j<nums2.length) {
            if (nums1[i]<nums2[j]) {
                mergedArr[k] = nums1[i];
                i++;
            } else if (nums2[j]<nums1[i]) {
                mergedArr[k] = nums2[j];
                j++;
            } else {
                mergedArr[k] = nums1[i];
                k++;
                i++;
                mergedArr[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        while(i<nums1.length) {
            mergedArr[k] = nums1[i];
            i++;
            k++;
        }
        
        while(j<nums2.length) {
            mergedArr[k] = nums2[j];
            j++;
            k++;
        }
        
        int mid = k/2;
        if(k%2==0) {
            return (mergedArr[mid] + mergedArr[mid-1])/2.0;
        } else {
            return mergedArr[mid];
        }
        
    }
}
