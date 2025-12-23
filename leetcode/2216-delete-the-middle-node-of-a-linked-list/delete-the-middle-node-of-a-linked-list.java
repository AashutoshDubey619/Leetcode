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
    public ListNode deleteMiddle(ListNode head) {
        
        ListNode p1 = head;
        ListNode p2 = head;

        if(head.next == null){
            return null;
        }

        int len = 0;
        
        ListNode temp = head;

        while(temp != null){
            len++;
            temp = temp.next;
        }

        int i = 0;
        while(i < (len/2)){
            p2 = p1;
            p1 = p1.next;
            i++;
        }
        
        p2.next = p1.next;
        p1.next = null;

        return head;
    }
}