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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();

        paths(root , 0 ,targetSum ,new ArrayList<>() , res);

        return res;
    }

    public void paths(TreeNode root ,int sum ,int targetSum , ArrayList<Integer> list ,  List<List<Integer>> res){

        if(root == null)return;
        else if(root.left == null && root.right == null){
            sum += root.val;
            list.add(root.val);
            if(targetSum == sum)res.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }

        list.add(root.val);
        paths(root.left , sum + root.val , targetSum , list , res);
        paths(root.right , sum + root.val , targetSum , list , res);
        list.remove(list.size()-1);
    }
}