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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        if(head.next.next == null)return new int[]{-1 , -1};

        int prev = -1;
        int critc = -1;
        int first = -1;

        ListNode l = head;
        ListNode m = head.next;
        ListNode r = head.next.next;
        int min_dist = Integer.MAX_VALUE;
        int i = 1;

        while(r != null){
            if((m.val > l.val && m.val > r.val) || (m.val < l.val && m.val < r.val)){
               
                if(critc == -1)first = i;
                
                critc = i;

                if(prev != -1){
                    min_dist = Math.min(min_dist , critc - prev);
                }
                prev = critc;

            }
            l = l.next;
            m = m.next;
            r = r.next;
            i++;
        }


        if(first == critc)return new int[]{-1 , -1};
        return new int[]{min_dist , critc - first};

    }
}