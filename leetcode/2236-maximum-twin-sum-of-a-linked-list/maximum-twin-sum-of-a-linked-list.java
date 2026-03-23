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
    public int pairSum(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = slow;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode curr = slow;
        ListNode prev = null;
        ListNode nextnode = slow;

        while(curr != null){
            nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }    
        
        ListNode temp = head;

        int max_sum = Integer.MIN_VALUE;

        while(temp != null && prev != null){
            max_sum = Math.max(max_sum , temp.val + prev.val);
            temp = temp.next;
            prev = prev.next;
        }

        return max_sum;
    }
}