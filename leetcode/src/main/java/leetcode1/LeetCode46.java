package leetcode1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 *
 * 示例:
 *
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 *
 */
public class LeetCode46 {

    @Test
    public void say()
    {

    }

    List<List<Integer>> lists;

    public List<List<Integer>> permute(int[] nums) {
//       if (nums.length==0)
//       {
           return null;
//       }

    }

    public void dsf(int nums[],int start)
    {
        if (start>nums.length)
        {
            return;
        }
        for (int i=start;i<nums.length;i++)
        {

        }
    }

}
