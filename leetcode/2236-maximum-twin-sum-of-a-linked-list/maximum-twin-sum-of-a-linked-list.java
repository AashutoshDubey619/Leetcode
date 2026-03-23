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
        
        ListNode temp = head;

        List<Integer> list = new ArrayList<>();

        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }


        int max_sum = Integer.MIN_VALUE;

        int l = 0;
        int r = list.size()-1;

        while(l < r){
            max_sum = Math.max(max_sum , list.get(l) + list.get(r));
            l++;
            r--;
        }

        return max_sum;
    }
}