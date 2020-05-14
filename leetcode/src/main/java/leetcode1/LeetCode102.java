package leetcode1;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 *  
 *
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 */
public class LeetCode102 {

    List<List<Integer>> lists=new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
       if (root==null)
       {
          return null;
       }
       List<Integer> list=new ArrayList<>();
       list.add(root.val);
       lists.add(list);
       List<Integer> list1=new ArrayList<>();
       list1.add(dsf(root.left));
       list1.add(dsf(root.right));
       lists.add(list1);
       return lists;
    }

    public Integer dsf(TreeNode root)
    {
        if (root==null)
        {
            return null;
        }
        List<Integer> list=new ArrayList<>();
        if (root.left!=null)
        {
            list.add(root.left.val);
        }
        if (root.right!=null)
        {
            list.add(root.right.val);
        }
        dsf(root.left);
        dsf(root.right);
        lists.add(list);
        return root.val;
    }

}
