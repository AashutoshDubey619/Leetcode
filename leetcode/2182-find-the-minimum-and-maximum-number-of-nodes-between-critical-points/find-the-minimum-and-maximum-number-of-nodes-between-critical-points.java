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

        ArrayList<Integer> list = new ArrayList<>();

        ListNode l = head;
        ListNode m = head.next;
        ListNode r = head.next.next;
        int min_dist = Integer.MAX_VALUE;
        ListNode left = null;
        ListNode right = null;
        int i = 0;

        while(r != null){
            if((m.val > l.val && m.val > r.val) || (m.val < l.val && m.val < r.val))list.add(i);
            l = l.next;
            m = m.next;
            r = r.next;
            i++;
        }

        for(int j=0;j<list.size()-1;j++){
            min_dist = Math.min(Math.abs(list.get(j) - list.get(j+1)) , min_dist);
        }

        if(list.size() <= 1)return new int[]{-1 , -1};
        return new int[]{min_dist , list.get(list.size()-1) - list.get(0)};

    }
}