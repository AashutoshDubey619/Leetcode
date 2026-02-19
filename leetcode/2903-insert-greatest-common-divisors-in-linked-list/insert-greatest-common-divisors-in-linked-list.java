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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = p1.next;

        while(p2 != null){
            ListNode newnode = new ListNode(getGcd(p1.val , p2.val));
            p1.next = newnode;
            newnode.next = p2;
            p1 = p2;
            p2 = p2.next;
        }

        return head;
    }
    
    public int getGcd(int a, int b){
        if(a >= b){
            for(int i=b;i>=1;i--){
                if(a % i ==0 && b % i == 0) return i;
            }
        }
        else if(a <= b){
            for(int i=a;i>=1;i--){
                if(a % i ==0 && b % i == 0) return i;
            }
        }

        return -1;
    }
    
}