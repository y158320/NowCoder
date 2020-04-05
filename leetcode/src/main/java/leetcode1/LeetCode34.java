package leetcode1;

import org.junit.Test;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 * 如果数组中不存在目标值，返回 [-1, -1]。
 *
 * 示例 1:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * 示例 2:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 */
public class LeetCode34 {

    @Test
    public void say()
    {
        System.out.println("1");
        int[] nums={5,7,7,8,8,10};
        System.out.println(searchRange(nums,8)[0]);
        System.out.println(searchRange(nums,8)[1]);
    }

    public int[] searchRange(int[] nums, int target) {
       int[] num={-1,-1};
       for (int i=0;i<nums.length;i++)
       {
           if (target==nums[i] && num[0]==-1)
           {
               num[0]=i;
           }else if (target==nums[i]){
               num[1]=i;
           }
       }
       return num;
    }

}
