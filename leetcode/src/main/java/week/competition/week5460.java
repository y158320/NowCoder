package week.competition;

/**
 * 5460. 好数对的数目 显示英文描述
 * 通过的用户数3169
 * 尝试过的用户数3187
 * 用户总通过次数3199
 * 用户总提交次数3361
 * 题目难度Easy
 * 给你一个整数数组 nums 。
 *
 * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
 *
 * 返回好数对的数目。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3,1,1,3]
 * 输出：4
 * 解释：有 4 组好数对，分别是 (0,3), (0,4), (3,4), (2,5) ，下标从 0 开始
 * 示例 2：
 *
 * 输入：nums = [1,1,1,1]
 * 输出：6
 * 解释：数组中的每组数字都是好数对
 * 示例 3：
 *
 * 输入：nums = [1,2,3]
 * 输出：0
 */
public class week5460 {

    public int numIdenticalPairs(int[] nums) {
      if(nums==null)
      {
          return 0;
      }
      int count=0;
      for (int i=0;i<nums.length-1;i++)
      {
          for (int j=i+1;j<nums.length;j++)
          {
              if (nums[i]==nums[j])
              {
                  count=count+1;
              }
          }
      }
      return count;
    }

}
