package leetcode1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树，返回它的中序 遍历。
 *
 * 示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,3,2]
 *
 */
public class LeetCode94 {
    /**
     * 递归
     */
    List<Integer> arr =new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return arr;
        inorderTraversal(root.left);
        arr.add(root.val);
        inorderTraversal(root.right);
        return arr;
    }
    /**
     * 非递归
     */
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
        return list;
    }
}
