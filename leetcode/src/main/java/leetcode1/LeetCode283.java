package leetcode1;

import org.junit.Test;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 */
public class LeetCode283 {

    @Test
    public void say()
    {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
        for (int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    }

    public void moveZeroes(int[] nums) {

        int temp=0;

        for (int i=0;i<nums.length;i++)
        {
            for (int j=i+1;j<nums.length;j++)
            {
                if (nums[i]==0)
                {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }

    }

}
