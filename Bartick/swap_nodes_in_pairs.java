// https://leetcode.com/problems/swap-nodes-in-pairs/

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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        
       
        ListNode swapedValue = new ListNode(0);
        swapedValue.next = head;
        ListNode temp = swapedValue;
        
        while(temp.next!=null && temp.next.next!=null) {
            ListNode t1 = temp;
            temp = temp.next;
            t1.next = temp.next;
            
            ListNode t2 = temp.next.next;
            temp.next.next = temp;
            temp.next = t2;
        }
        
        return swapedValue.next;
    }
}
