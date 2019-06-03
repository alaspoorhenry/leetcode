/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public static ListNode recAdd (ListNode cons, int overFlow, ListNode summand1, ListNode summand2){
        if (summand1 != null || summand2 != null){
            int val1 = 0;
            int val2 = 0;
            if (summand1 != null){
                val1 = summand1.val;
            }
            if (summand2 != null){
                val2 = summand2.val;
            }
            cons.next = new ListNode((val1+val2+overFlow)%10);
            recAdd(cons.next, (val1+val2+overFlow)/10, (summand1 == null) ? null : summand1.next, (summand2 == null) ? null : summand2.next);
        }
        else if (overFlow != 0){
            cons.next = new ListNode(overFlow); 
            recAdd(cons.next, 0, null, null);
        }
        return null;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode inp = new ListNode((l1.val+l2.val)%10);
        Solution.recAdd(inp, (l1.val+l2.val)/10, l1.next, l2.next);
        return inp;
    }
}
