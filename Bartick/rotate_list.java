// https://leetcode.com/problems/rotate-list/

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
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null) return null;
        ListNode answer, countHelper, temp;
        answer = countHelper = temp = head;
        int count = 0;
        while (countHelper!= null) {
            countHelper = countHelper.next;
            count ++;
        }
        k = k % count;
        for (int i = 0; i < k ; i++) {
            temp = temp.next;
        }
        while(temp.next != null) {
            answer = answer.next;
            temp = temp.next;
        }
        temp.next = head;
        ListNode result = answer.next;
        answer.next = null;
        return result;
    }
}
