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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode dummy = new ListNode();
        ListNode temp3 = dummy;
        int carry = 0;

        while(temp1 != null || temp2 != null){
            int sum;
            if(temp1 == null)sum = carry + temp2.val;
            else if(temp2 == null)sum = carry + temp1.val;
            else sum = carry + temp1.val + temp2.val;

            carry = sum / 10;

            temp3.next = new ListNode(sum % 10);
            temp3 = temp3.next;

            if(temp1 != null)temp1 = temp1.next;
            if(temp2 != null)temp2 = temp2.next;
        }

        if(carry != 0)temp3.next = new ListNode(carry);

        return dummy.next;
    }
}