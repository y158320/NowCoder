package leetcode1;

import java.util.ArrayList;
import java.util.List;

public class LeetCode174 {

    List<Integer> list=new ArrayList<>();
    int count=0;
    int sum=0;

    public LeetCode174(TreeNode root) {
        dfs(root);
    }

    public void dfs(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        dfs(root.left);
        list.add(root.val);
        sum=sum+1;
        dfs(root.right);
    }

    /** @return the next smallest number */
    public int next() {
      if (count<=sum)
      {
          int a=list.get(count);
          count=count+1;
          return a;
      }else {
          return 0;
      }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if (count<sum)
        {
            return true;
        }else {
            return false;
        }
    }

}
