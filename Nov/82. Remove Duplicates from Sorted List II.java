// https://leetcode.com/submissions/detail/849739052/

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
    public ListNode deleteDuplicates(ListNode head) {
        // at 0th index placing dummy at the head
        ListNode d = new ListNode(0,head);
        //prev pointing to dummy
        ListNode prev = d;
        // prev-> head
        
        while(head != null){
            while(head.next != null && head.val == head.next.val){
                // if not duplicates present
                // incrementing the node 
                head = head.next;
            }
            if(prev.next == head) prev=prev.next;
            else prev.next = head.next;
            
            head = head.next;
        }
        return d.next;
    }
}
