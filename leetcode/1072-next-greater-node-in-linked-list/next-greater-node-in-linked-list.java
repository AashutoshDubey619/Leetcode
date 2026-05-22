class Solution {
    
    class Pair {
        int idx;
        int val;

        Pair(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }
    }

    public int[] nextLargerNodes(ListNode head) {

        ArrayList<Integer> res = new ArrayList<>();

        Stack<Pair> stk = new Stack<>();

        int idx = 0;

        while(head != null) {

            res.add(0);

            while(!stk.isEmpty() && stk.peek().val < head.val) {
                Pair p = stk.pop();
                res.set(p.idx, head.val);
            }

            stk.push(new Pair(idx, head.val));

            idx++;
            head = head.next;
        }

        int[] ans = new int[res.size()];

        for(int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }
}