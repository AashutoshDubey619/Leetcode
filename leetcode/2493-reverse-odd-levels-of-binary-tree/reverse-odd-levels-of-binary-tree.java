/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        
        if(root.left == null && root.right == null)return root;

        Queue<TreeNode> q = new LinkedList<>();

        ArrayList<ArrayList<Integer>> vals = new ArrayList<>();

        
        q.add(root);

        int level = 0;

        while(!q.isEmpty()){
            int size = q.size();

            vals.add(new ArrayList<>());

            for(int s=0;s<size;s++){
                TreeNode node = q.poll();
                vals.get(level).add(node.val);

                if(node.left != null)q.add(node.left);
                if(node.right != null)q.add(node.right);
            }

            level++;
        }

        for(int i=0;i<vals.size();i++){
            if(i % 2 == 1){
                Collections.reverse(vals.get(i));
            }
        }

        level = 0;

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            
            for(int s=0;s<size;s++){
                TreeNode node = q.poll();

                node.val = vals.get(level).get(s);

                if(node.left != null)q.add(node.left);
                if(node.right != null)q.add(node.right);
            }

            level++;
        }



        return root;

    }
}