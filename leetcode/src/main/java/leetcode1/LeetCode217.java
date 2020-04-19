package leetcode1;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 *
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 *
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 */
public class LeetCode217 {

    @Test
    public void say()
    {
        Set<Integer> set=new HashSet<Integer>();
        System.out.println(set.add(1));
        System.out.println(set.add(1));
    }

    //超时
    public boolean containsDuplicate(int[] nums) {
       if (nums==null)
       {
           return false;
       }
       for (int i=0;i<nums.length-1;i++)
       {
           for (int j=i+1;j<nums.length;j++)
           {
               if (nums[i]==nums[j])
               {
                   return true;
               }
           }
       }
       return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        for (int i=0;i<nums.length;i++)
        {
            if (set.add(nums[i])==false)
            {
                return true;
            }
        }
        return false;
    }

}
