package leetcode1;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 * 返回:
 *
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 *
 */
public class LeetCode113 {

    List<List<Integer>> lists=new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root==null)
        {
            return null;
        }
        dsf(root,sum,0);
//        if (root.left==null && root.right==null)
        return lists;
    }

    public void dsf(TreeNode root,int sum,int num)
    {

    }

}
