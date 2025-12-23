/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        HashSet<ListNode> set = new HashSet<>();

        ListNode temp = head;

        while(temp != null){
             if(set.contains(temp.next)){
                return true;
             }
             set.add(temp.next);
             temp = temp.next;
        }

        return false;
    }
}