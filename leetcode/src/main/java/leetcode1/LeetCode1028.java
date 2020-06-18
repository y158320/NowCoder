package leetcode1;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * 我们从二叉树的根节点 root 开始进行深度优先搜索。
 *
 * 在遍历中的每个节点处，我们输出 D 条短划线（其中 D 是该节点的深度），然后输出该节点的值。（如果节点的深度为 D，则其直接子节点的深度为 D + 1。根节点的深度为 0）。
 *
 * 如果节点只有一个子节点，那么保证该子节点为左子节点。
 *
 * 给出遍历输出 S，还原树并返回其根节点 root。
 *
 *  
 *
 * 示例 1：
 *
 *
 *
 * 输入："1-2--3--4-5--6--7"
 * 输出：[1,2,5,3,4,6,7]
 * 示例 2：
 *
 *
 *
 * 输入："1-2--3---4-5--6---7"
 * 输出：[1,2,5,3,null,6,null,4,null,7]
 * 示例 3：
 *
 *
 *
 * 输入："1-401--349---90--88"
 * 输出：[1,401,null,349,88,90]
 *  
 */
public class LeetCode1028 {

    public TreeNode recoverFromPreorder(String S) {
        List<String> nums = new LinkedList<>();
        List<Integer> deeps = new LinkedList<>();
        int len = S.length();
        deeps.add(0);
        for(int i = 0; i < len; i++){
            int count = 0;
            StringBuilder temp = new StringBuilder();
            if(S.charAt(i) == '-'){
                while(S.charAt(i) == '-'){
                    count++;
                    i++;
                }
                deeps.add(count);
                i--;
            }else{
                while(i < len && S.charAt(i) != '-'){
                    temp.append(S.charAt(i));
                    i++;
                }
                nums.add(temp.toString());
                i--;
            }
        }
        TreeNode res = dfs(0, nums, deeps);
        return res;
    }
    public TreeNode dfs(int deep, List<String> nums, List<Integer> deeps){
        if(deeps.size() == 0 || deep != deeps.get(0)){
            return null;
        }
        // if(deeps.size() == 0){
        //     return null;
        // }
        deeps.remove(0);
        TreeNode temp = new TreeNode(Integer.valueOf(nums.remove(0)));
        temp.left = dfs(deep + 1, nums, deeps);
        temp.right = dfs(deep + 1, nums, deeps);
        return temp;
    }

}
