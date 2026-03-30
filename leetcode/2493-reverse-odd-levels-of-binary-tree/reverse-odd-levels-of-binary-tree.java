class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int level = 0;

        while(!q.isEmpty()){
            int size = q.size();
            List<TreeNode> list = new ArrayList<>();

            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                list.add(node);

                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }

            if(level % 2 == 1){
                int i = 0, j = list.size() - 1;

                while(i < j){
                    int temp = list.get(i).val;
                    list.get(i).val = list.get(j).val;
                    list.get(j).val = temp;
                    i++;
                    j--;
                }
            }

            level++;
        }

        return root;
    }
}