package leetcode1;

import org.junit.Test;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 */
public class LeetCode1 {

    @Test
    public void say()
    {
        int[] nums={2,7,11,15};
        int[] a=twoSum(nums,9);
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    /**
     * 执行用时 :45 ms, 在所有 java 提交中击败了19.64%的用户
     * 内存消耗 :37.3 MB,在所有 java 提交中击败了89.97%的用户
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
       int[] a=new int[2];
       for (int i=0;i<nums.length;i++)
       {
           for (int j=i+1;j<nums.length;j++)
           {
               if ((nums[i]+nums[j])==target)
               {
                   a[0]=i;
                   a[1]=j;
               }
           }
       }
       return a;
    }

}
