// https://leetcode.com/problems/reverse-linked-list-ii/submissions/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode preRev = null;
        ListNode curr = head;
        int i = 1;
        while(i<left) { 
            preRev = curr; 
            curr = curr.next; 
            i++; 
        }
        
        ListNode end = curr;     
        ListNode pre = null; 
        while(i<=right) {
         ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
            i++;
        }
        
        end.next = curr;
        if(preRev != null) preRev.next = pre;
        return preRev == null ? pre: head;  
    }
}
