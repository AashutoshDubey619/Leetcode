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
    public TreeNode createBinaryTree(int[][] descriptions) {
        
        HashMap<Integer , TreeNode> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int d[] : descriptions){
            int parent = d[0];
            int child = d[1];

            map.putIfAbsent(parent , new TreeNode(parent));
            map.putIfAbsent(child , new TreeNode(child));
            set.add(child);
        }

        for(int d[] : descriptions){
            int parent = d[0];
            int child = d[1];
            int isLeft = d[2];

            if(isLeft == 1)map.get(parent).left = map.get(child);
            else map.get(parent).right = map.get(child);
        }

        for(int key : map.keySet()){
            if(!set.contains(key)){
                return map.get(key);
            }
        }

        return null;
    }
}