//https://leetcode.com/submissions/detail/832138861/

class Solution {
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode nx = head.next;
            head.next = prev;
            prev=head;
            head=nx;
        }
        return prev;
    }
    
    //----------------------------------------------------

    public boolean isPalindrome(ListNode head) {
        // fast and slow pointer
        ListNode slow = head,fast = head.next;
        
        while(fast!= null && fast.next != null){
            slow=slow.next;
            fast= fast.next.next;
        }
        // reverse
        slow = reverse(slow); 
        
        while(head != null && slow != null){
            if(slow.val != head.val) return false; // does not match after reversing the ll
            
            // idx increment
            slow = slow.next;
            head = head.next;
        }
        
        return true;
    }
}
