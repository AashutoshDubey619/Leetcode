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
    public TreeNode balanceBST(TreeNode root) {
        if(root == null) return null;

        ArrayList<Integer> list = new ArrayList<>();
        inorder(root , list);   

        return convert(list , 0 , list.size()-1);
    }

    
    public TreeNode convert(ArrayList<Integer>list , int l , int h){
        if(l > h) return null;

        int m = l + (h-l)/2;

        TreeNode root = new TreeNode(list.get(m));

        root.left = convert(list , l , m - 1); 
        root.right = convert(list , m + 1 , h ); 
        return root;
    }

    public void inorder(TreeNode root , ArrayList<Integer> list){
        if(root == null) return;

        inorder(root.left , list);
        list.add(root.val);
        inorder(root.right , list);
    }


}