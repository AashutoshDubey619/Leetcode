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
    public int[] nextLargerNodes(ListNode head) {

        ListNode temp = head;

        int len = 0;

        while(temp != null){
            len++;
            temp = temp.next;
        }

        temp = head;

        int[] nodes = new int[len];
        int[] res = new int[len];

        int j = 0;
         while(temp != null){
            nodes[j] = temp.val;
            j++;
            temp = temp.next;
        }

        Deque<Integer> stk = new ArrayDeque<>();

        for(int i=0;i<nodes.length;i++){
            while(!stk.isEmpty() && nodes[stk.peek()] < nodes[i]){
                res[stk.pop()] = nodes[i];
            }
            stk.push(i);
        }

        return res;
    }
}