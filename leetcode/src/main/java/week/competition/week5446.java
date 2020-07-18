package week.competition;

import org.junit.Test;

import java.util.Arrays;

/**
 * 给你一个数组 nums ，每次操作你可以选择 nums 中的任意一个数字并将它改成任意值。
 *
 * 请你返回三次操作后， nums 中最大值与最小值的差的最小值。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [5,3,2,4]
 * 输出：0
 * 解释：将数组 [5,3,2,4] 变成 [2,2,2,2].
 * 最大值与最小值的差为 2-2 = 0 。
 * 示例 2：
 *
 * 输入：nums = [1,5,0,10,14]
 * 输出：1
 * 解释：将数组 [1,5,0,10,14] 变成 [1,1,0,1,1] 。
 * 最大值与最小值的差为 1-0 = 1 。
 * 示例 3：
 *
 * 输入：nums = [6,6,0,1,1,4,6]
 * 输出：2
 * 示例 4：
 *
 * 输入：nums = [1,5,6,14,15]
 * 输出：1
 */
public class week5446 {

    @Test
    public void say()
    {
        int[] nums={20,66,68,57,45,18,42,34,37,58};
        System.out.println(minDifference(nums));
    }

    public int minDifference(int[] nums) {
       if (nums==null)
       {
           return 0;
       }
       int[][] dp=new int[nums.length][nums.length];
       for (int i=0;i<nums.length;i++)
       {
           for (int j=0;j<nums.length;j++)
           {
               dp[i][j]=Math.abs(nums[i]-nums[j]);
           }
       }
       for (int i=0;i<dp.length;i++)
       {
           Arrays.sort(dp[i]);
       }
       int a=0;
       for (int i=0;i<dp.length;i++)
       {
           int sum=0;
           for (int j=0;j<dp[0].length-3;j++)
           {
               sum=sum+dp[i][j];
           }
           if (i==0)
           {
               a=sum;
           }else
           {
               a=Math.min(a,sum);
           }
       }
       return a;
    }

}
