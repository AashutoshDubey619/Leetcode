/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        

        List<List<Integer>> res = new ArrayList<>();
        if(root == null)return res;

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(q.size() > 0){
            ArrayList<Integer> temp = new ArrayList<>();
            int size = q.size();

            for(int s = 0;s < size;s++){
                Node n = q.poll();
                temp.add(n.val);
                
                for(Node c : n.children){
                    q.add(c);
                }
            }

            res.add(temp);
        }

        return res; 
    }
}