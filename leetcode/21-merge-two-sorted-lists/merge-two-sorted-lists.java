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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1 = list1 , p2 = list2;

        ListNode p3 = new ListNode();
        ListNode head = p3;

        while(p1 != null && p2 != null){
            if(p1.val == p2.val){
                if(p3 == null){
                    p3.val = p1.val;
                    p3.next = new ListNode(p1.val);
                    p3 = p3.next;
                }
                else{
                    p3.next = new ListNode(p1.val);
                    p3 = p3.next;
                    p3.next = new ListNode(p1.val);
                    p3 = p3.next;
                }
                p1 = p1.next;
                p2 = p2.next;
            }
            else if(p1.val > p2.val){
                if(p3 == null){
                    p3.val = p2.val;
                }
                else p3.next = new ListNode(p2.val);
                p3 = p3.next;

                p2 = p2.next;
            }
            else{
                if(p3 == null){
                    p3.val = p1.val;
                }
                else p3.next = new ListNode(p1.val);
                p3 = p3.next;

                p1 = p1.next;
            }
        }


        while(p1 != null){
            p3.next = new ListNode(p1.val);
            p3 = p3.next;
            p1 = p1.next;
        }

        while(p2 != null){
            p3.next = new ListNode(p2.val);
            p3 = p3.next;
            p2 = p2.next;
        }

        return head.next;
    }
}