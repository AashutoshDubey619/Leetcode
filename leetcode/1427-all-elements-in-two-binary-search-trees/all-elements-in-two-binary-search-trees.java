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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res = new ArrayList<>();
        
        if(root1 == null && root2 == null)return res;
        else if(root1 == null)getElements(root2 , res);
        else if(root2 == null)getElements(root1 , res);
        else{
            getElements(root1 , res);
            getElements(root2 , res);
        } 

        Collections.sort(res);

        return res;
    }

    public void getElements(TreeNode root , List<Integer> res){
        if(root == null)return;

        getElements(root.left , res);
        res.add(root.val);
        getElements(root.right , res);
    }
}