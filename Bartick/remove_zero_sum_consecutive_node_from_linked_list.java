// https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/

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
    public ListNode removeZeroSumSublists(ListNode head) {
      ListNode dummy = new ListNode(0);
      ListNode currNode = dummy;
      dummy.next = head;
      int prefixSum = 0;
      Map<Integer, ListNode> prefixSumMap = new HashMap<>();
      while (currNode != null) {
        prefixSum += currNode.val;
        if (prefixSumMap.containsKey(prefixSum)) {
          currNode = prefixSumMap.get(prefixSum).next;
          int sum = prefixSum + currNode.val;
          while (sum != prefixSum) {
            prefixSumMap.remove(sum);
            currNode = currNode.next;
            sum += currNode.val;
          }
          prefixSumMap.get(prefixSum).next = currNode.next;
        } else {
          prefixSumMap.put(prefixSum, currNode);
        }
        currNode = currNode.next;
      }
      return dummy.next;
    }
}
