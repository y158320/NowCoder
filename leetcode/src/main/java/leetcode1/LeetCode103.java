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

    public void dfs(TreeNode root,int num)
    {
        if (root==null)
        {
            return;
        }
        List<Integer> list=new ArrayList<>();
        if (0==num)
        {
            dfs(root.right,1);
            dfs(root.left,1);
            list.add(root.val);
            lists.add(list);
        }else
        {
            dfs(root.left,1);
            dfs(root.right,1);
            list.add(root.val);
            lists.add(list);
        }
    }

}
