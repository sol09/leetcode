/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if ((p == null && q != null) || (p != null && q == null))
            return false;
        boolean b = false;
        if (p.val == q.val)
            b = true;
        if (b)
            b = isSameTree(p.left, q.left);
        if (b)
            b = isSameTree(p.right, q.right);
        return b;
    }
}