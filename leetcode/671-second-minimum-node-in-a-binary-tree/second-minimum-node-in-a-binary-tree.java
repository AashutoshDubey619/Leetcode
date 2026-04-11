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
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();

        inorder(list , root);
        
        Collections.sort(list);

        return list.size() > 1 ? list.get(1) : -1;
    }

    public void inorder(ArrayList<Integer> list , TreeNode root){
        if(root == null)return;

        inorder(list , root.left);
        if(!list.contains(root.val))list.add(root.val);
        inorder(list , root.right);
    }
}