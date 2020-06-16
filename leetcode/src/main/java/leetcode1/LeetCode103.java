package leetcode1;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回锯齿形层次遍历如下：
 *
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 *
 */
public class LeetCode103 {

    List<List<Integer>> lists=new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       if (root==null)
       {
           return null;
       }
       dfs(root,0);
       List<Integer> list=new ArrayList<>();
       list.add(root.val);
       lists.add(list);
       return lists;
    }

    public int dfs(TreeNode root,int num)
    {
        if (root==null)
        {
            return 0;
        }
        List<Integer> list=new ArrayList<>();
        if (0==num)
        {
            int right=dfs(root.right,1);
            int left=dfs(root.left,1);
            list.add(right);
            list.add(left);
            lists.add(list);
        }else
        {
            dfs(root.left,1);
            dfs(root.right,1);
            list.add(root.val);
            lists.add(list);
        }
        return root.val;
    }

    public List<List<Integer>> zigzagLevelOrder1(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        traversal(root, res, 0);
        return res;
    }

    private void traversal(TreeNode root, List<List<Integer>> res, int level) {
        if (root == null) {
            return;
        }

        if (res.size() == level) {
            res.add(new ArrayList<Integer>());
        }

        if ((level & 1) == 1){
            res.get(level).add(0, root.val);
        } else {
            res.get(level).add(root.val);
        }

        traversal(root.left, res, level + 1);
        traversal(root.right, res, level + 1);
    }

}
