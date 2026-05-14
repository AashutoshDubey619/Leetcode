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
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        int len = 0;
        ListNode temp = head;

        while(temp != null){
            len++;
            temp = temp.next;
        }

        ListNode[] res = new ListNode[k];
        ListNode temp2 = head;

        if(len < k){
            for(int i=0;i<len;i++){
                res[i] = temp2;
                ListNode tail = temp2;
                if(temp2.next != null)temp2 = temp2.next;
                tail.next = null;
            }

            return res;
        }

        int size = len / k;
        int extra = len % k;



        for(int i=0;i<res.length;i++){
            int count = 0;
            ListNode h = temp2;

            while(count < size-1 && temp2 != null){
                temp2 = temp2.next;
                count++;
            }

            if(extra >= 1){
                temp2 = temp2.next;
                extra--;
            }

            ListNode tail = temp2;
            temp2 = temp2.next;
            tail.next = null;

            res[i] = h;
        }

        return res;
    }
}