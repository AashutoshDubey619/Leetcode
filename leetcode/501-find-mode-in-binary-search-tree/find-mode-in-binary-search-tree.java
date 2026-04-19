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
    public int[] findMode(TreeNode root) {
        
        HashMap<Integer , Integer> map = new HashMap<>();

        traverse(root , map);

        int max_freq = Integer.MIN_VALUE;

        for(int key : map.keySet()){
            max_freq = Math.max(max_freq , map.get(key));
        }

        int size = 0;

        for(int key : map.keySet()){
            if(map.get(key) == max_freq)size++;
        }

        int res[] = new int[size];
        int k = 0;
        
        for(int key : map.keySet()){
            if(map.get(key) == max_freq)res[k++] = key;
        }
        
        return res;
    }

    public void traverse(TreeNode root , HashMap<Integer , Integer> map){
        if(root == null)return;

        traverse(root.left , map);
        map.put(root.val , map.getOrDefault(root.val , 0)+1);
        traverse(root.right , map);
    }
}