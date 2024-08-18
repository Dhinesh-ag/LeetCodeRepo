class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<Integer> list = new ArrayList<>();
        
        while (!q.isEmpty()) {
            int q_size = q.size();
            
            
            for (int i = 0; i < q_size; i++) {
                TreeNode temp = q.poll();
                list.add(temp.val);
                
                if (temp.left != null) {
                    q.offer(temp.left);
                }
                
                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }
        }
        Collections.sort(list);
        return list.get(k-1);
    }
}