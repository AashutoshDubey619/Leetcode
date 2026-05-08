/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        if(root == null)return root;

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Node> temp = new ArrayList<>();

            for(int s=0;s<size;s++){
                Node node = q.poll();   
                
                temp.add(node);

                if(node.left != null)q.add(node.left);
                if(node.right != null)q.add(node.right);
            }

            for(int i=1;i<temp.size();i++){
                temp.get(i-1).next = temp.get(i);
            }
        }

        return root;
    }
}