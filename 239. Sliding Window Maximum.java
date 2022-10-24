// https://leetcode.com/submissions/detail/829208418/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int p = 0;
        int n = nums.length;
        int[] res = new int[n-k+1];
        
        // declaring the dequeue
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int i=0;i<n;i++){
            // checking for out of bounadry elements
            if(!dq.isEmpty() && dq.peek() == i-k) // for k =3 upto 0 1 2 --> the first subarray
            {
                dq.poll();
            }
            
            //checking if the elements corresponding to the indexes stored are in the decreasing fashion or not
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }
            
            //push in deque is offer
            
            // pushing the current index into the deque
            dq.offer(i);
            
            if(i >= k-1){
                res[p++] = nums[dq.peek()]; // storing the max value in res array during the starting pnt of each subarray
            }
        }
        return res;
    }
}
