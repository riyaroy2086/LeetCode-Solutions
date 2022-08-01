class Solution1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
    //  Median of Two Sorted Arrays

    //----------------------------------------------------------------- 
    // BRUTE FORCE
        
    //         int n1 = nums1.length, n2 = nums2.length;
    //         int res[] = new int[n1+n2];
    //         Arrays.sort()
    //         System.arraycopy(nums1, 0, res, 0, n1);  
    //         System.arraycopy(nums2, 0, res, n1, n2);  
    //         Arrays.sort(res);

    //         int mid =(res.length / 2) ;
    //         if(res.length % 2 == 0){

    // //             int last = res[mid];        
    // //             int sec_last = res[mid - 1];
    // //             int ans =  Math.round(last + sec_last) /2;
    //             return(res[mid]+res[mid-1]/(double)2) ;
    //         }else{

    //             return res[mid];
    //         }

    //------------------------------------------------------------------        

    // TC-> O log(m+n)
        
        int n1 = nums1.length, n2 = nums2.length;
        int res[] = new int[n1+n2];
        int i,j,k;
        i=j=k=0;
        
        while(i < n1 && j < n2) {
            if(nums1[i] <= nums2[j])  res[k++] = nums1[i++];
            else res[k++] = nums2[j++];
        }
        
        while(i < n1) 
            res[k++] = nums1[i++];
     
        while(j < n2) 
            res[k++] = nums2[j++];

        int mid = res.length / 2;
        
        if(res.length % 2 == 1) return res[mid];
        else  return (res[mid] + res[mid - 1])/2.0;    
    }
}