package leetcode1;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 输入:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * 输出: ["1->2->5", "1->3"]
 *
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 *
 */
public class LeetCode257 {

    List<String> list=new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
       if (root==null)
       {
           return null;
       }
       dsf("",root);
       return list;
    }

    public void dsf(String path,TreeNode treeNode)
    {
       if (treeNode.left==null && treeNode.right==null)
       {
           list.add(path);
       }else
       {
           dsf(path+"->", treeNode.left);
           dsf(path+"->", treeNode.right);
       }
    }

}
