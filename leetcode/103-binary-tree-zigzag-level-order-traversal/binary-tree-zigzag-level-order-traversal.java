class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean leftToRight = true;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<>(size);

            for(int i=0;i<size;i++){
                TreeNode node = q.poll();

                if(leftToRight){
                    temp.add(node.val);
                } else {
                    temp.add(0, node.val); 
                }

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }

            res.add(temp);
            leftToRight = !leftToRight;
        }

        return res;
    }
}
