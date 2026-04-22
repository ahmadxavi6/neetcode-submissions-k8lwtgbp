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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null)
        return ans;
        queue.add(root);
        int level=0;

 

        while(!queue.isEmpty())
        {
            ArrayList<Integer> list_temp = new ArrayList<>();
            level=queue.size();
            for(int i=0;i<level;i++)
            {

            TreeNode temp = queue.poll();
            list_temp.add(temp.val);

            if(temp.left!=null)
            queue.add(temp.left);

            if(temp.right!=null)
            queue.add(temp.right);
            }

            ans.add(list_temp);

        }

        return ans;
    }
}