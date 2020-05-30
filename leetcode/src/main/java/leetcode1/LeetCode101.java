package leetcode1;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 *  
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *  
 *
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *  
 *
 * 进阶：
 *
 * 你可以运用递归和迭代两种方法解决这个问题吗？
 *
 */
public class LeetCode101 {

    public boolean isSymmetric(TreeNode root) {
       if (root==null){
           return true;
       }
       return dsf(root.left,root.right);
    }

    public boolean dsf(TreeNode left,TreeNode right)
    {
        if (left==null && right==null)
        {
            return true;
        }
        if (left==null || right==null)
        {
            return false;
        }
        if (left.val!=right.val)
        {
            return false;
        }
        return dsf(left.left,right.right)&&dsf(left.right,right.left);
    }

}
