/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head.next;
        helper(head);
        return temp;
    }
    public static void helper(ListNode head) {
        if (head == null){
            return;
        }
        ListNode disloc = head.next.next;
        helper(disloc);
        head.next.next = head;
        head.next = disloc.next;
    }
}
