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
    ArrayList<Integer> list = new ArrayList<>();
    ListNode ll;

    public Solution(ListNode head) {
        ll = head;
        fill(ll);
    }

    public void fill(ListNode head){
        ListNode temp = head;

        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

    }
    
    public int getRandom() {
        int index = (int)(Math.random() * list.size());

        return list.get((int)index);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */