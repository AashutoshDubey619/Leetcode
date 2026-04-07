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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        ArrayList<Integer> list = new ArrayList<>();

        while(q.size() > 0){
            int size = q.size();
            int levelsum = 0;

            for(int s = 0;s<size;s++){
                TreeNode node = q.poll();

                if(node.left !=null)q.add(node.left);
                if(node.right !=null)q.add(node.right);

                levelsum += node.val;
            }

            list.add(levelsum);
        }

        return list.get(list.size()-1);
    }
}