package leetcode1;

import java.util.ArrayList;
import java.util.List;

public class LeetCode144 {

    List<Integer> list=new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root==null)
        {
            return null;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }

}
