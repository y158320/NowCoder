package leetcode1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 */
public class LeetCode15 {

    @Test
    public void say()
    {
        int[] nums={0,0,0,0};
        System.out.println(threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists=new ArrayList<>();
        for (int i=0;i<nums.length;i++)
        {
            for (int j=i+1;j<nums.length;j++)
            {
                for (int k=j+1;k<nums.length;k++)
                {
                    if ((nums[i]+nums[j]+nums[k])==0)
                    {
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        lists.add(list);
                    }
                }
            }
        }
        for (int i=0;i<lists.size();i++)
        {
            for (int j=i+1;j<lists.size();j++)
            {
                List<Integer> list=new ArrayList<>();
                List<Integer> list1=new ArrayList<>();
                list=lists.get(i);
                list1=lists.get(j);
                if (equalList(list,list1))
                {
                    lists.remove(j);
                }
            }

        }
        return lists;
    }

    public boolean equalList(List list1, List list2) {
        if (list1.size() != list2.size())
            return false;
        for (Object object : list1) {
            if (!list2.contains(object))
                return false;
        }
        return true;
    }

}
