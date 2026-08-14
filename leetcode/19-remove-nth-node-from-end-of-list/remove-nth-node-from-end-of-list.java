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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        

        ListNode temp = head;
        int len = 0;

        while(temp != null){
            len++;
            temp = temp.next;
        }

        if(head.next == null || (len-n)-1 < 0 )return head.next;


        ListNode ptr = head;
        int i = 0;

        while(i < (len-n)-1){
            ptr = ptr.next;
            i++;
        }

        if(ptr.next != null)ptr.next = ptr.next.next;

        return head;
    }
}