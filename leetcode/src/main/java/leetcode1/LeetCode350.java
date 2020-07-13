package leetcode1;

import java.util.ArrayList;
import java.util.List;

public class LeetCode350 {

    public int[] intersect(int[] nums1, int[] nums2) {

        if (nums1==null || nums2==null)
        {
            return null;
        }
        List<Integer> list=new ArrayList<Integer>();
        for (int i=0;i<nums1.length;i++)
        {
            for (int j=0;j<nums2.length;j++)
            {
                if (nums1[i]==nums2[j])
                {
                    if (!list.contains(nums1[i]))
                    {
                        list.add(nums1[i]);
                    }
                }
            }
        }
        int[] a=new int[list.size()];
        for (int i=0;i<list.size();i++)
        {
            a[i]=list.get(i);
        }
        return a;
    }

}
