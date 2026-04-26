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
    public ListNode partition(ListNode head, int x) {
        
        if(head == null || head.next == null)return head;

        ListNode smallhead = null;
        ListNode largehead = null;
        ListNode temp = head;
        ListNode temp2 = null;
        ListNode temp3 = null;
        
        while(temp != null){
            if(temp.val < x){
                if(smallhead == null){
                    smallhead = new ListNode(temp.val);
                    temp2 = smallhead;
                    }
                else{
                    temp2.next = new ListNode(temp.val);
                    temp2 = temp2.next;
                }
            }
            else{
                if(largehead == null){
                    largehead = new ListNode(temp.val);
                    temp3 = largehead;
                    }
                else{
                    temp3.next = new ListNode(temp.val);
                    temp3 = temp3.next;
                }
            }

                temp = temp.next;
        }

        if(smallhead == null)return largehead;
        
        if(largehead != null)temp2.next = largehead;

        return smallhead;
    }
}