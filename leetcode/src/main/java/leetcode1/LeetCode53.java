package leetcode1;

import org.junit.Test;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 *
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 */
public class LeetCode53 {

    int num=0;
    int num1=0;

    @Test
    public void say()
    {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public int maxSubArray1(int[] nums) {
        int n = nums.length;
        int currSum = nums[0], maxSum = nums[0];

        for(int i = 1; i < n; ++i) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }


    public int maxSubArray(int[] nums) {

        for (int i=0;i<nums.length;i++)
        {
            num=0;
            backInt(nums,i);
        }
        return num;
    }
    public int backInt(int[] nums,int start)
    {
        if (start==nums.length)
        {
            return num1;
        }
        num=num+nums[start];
        if (num>num1)
        {
            num1=num;
        }
        backInt(nums,start+1);
        return num1;
    }
}
