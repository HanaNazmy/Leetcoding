// https://leetcode.com/problems/range-sum-of-bst/

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
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = new TreeNode();
        curr = root;
        stack.push(root);
        
        while(!stack.isEmpty()) {
            curr = stack.pop();
            if(inRange(low, high, curr.val))
            {
                sum += curr.val;
                // System.out.println("current node "+curr.val+" current sum "+ sum);
            }

            if(curr.right != null) {
                stack.push(curr.right);
            }    
            if(curr.left != null) {
                stack.push(curr.left);
            }
        }        
    return sum;
    }

    public boolean inRange(int low, int high, int val)
    {
        if(val < low || val > high)
            return false;
        return true;
    }
}

