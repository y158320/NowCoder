package leetcode1;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 *
 * 示例:
 *
 * 输入: [1,2,3,null,5,null,4]
 * 输出: [1, 3, 4]
 * 解释:
 *
 *    1            <---
 *  /   \
 * 2     3         <---
 *  \     \
 *   5     4       <---
 *
 */
public class LeetCode199 {

    List<Integer> list=new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        if (root==null)
        {
            return list;
        }
        list.add(root.val);
        des(root);
        return list;
    }

    public void des(TreeNode root)
    {
       if (root.right==null)
       {
           if (root.left==null)
           {
               return;
           }
           list.add(root.left.val);
           des(root.left);
       }else
       {
           list.add(root.right.val);
           des(root.right);
       }
    }

}
