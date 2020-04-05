package leetcode1;

import org.junit.Test;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 */
public class LeetCode136 {

    @Test
    public void say()
    {
        int[] nums={-1,-1,-2};
        System.out.println(singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        int a=0;
        if (nums==null)
        {
            return 0;
        }
        for (int num:nums)
        {
            a=a^num;
        }

        return a;
    }

}
