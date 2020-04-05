package leetcode1;

import org.junit.Test;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 示例 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 * 示例 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * 则中位数是 (2 + 3)/2 = 2.5
 *
 */
public class LeetCode4 {

    @Test
    public void say()
    {
        int[] a={3};
        int[] b={-2,-1};
        System.out.println(findMedianSortedArrays1(a,b));
    }

    public double findMedianSortedArrays1(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int len = m + n;
        int left = -1, right = -1;
        int aStart = 0, bStart = 0;
        for (int i = 0; i <= len / 2; i++) {
            left = right;
            if (aStart < m && (bStart >= n || A[aStart] < B[bStart])) {
                right = A[aStart++];
            } else {
                right = B[bStart++];
            }
        }
        if ((len & 1) == 0)
            return (left + right) / 2.0;
        else
            return right;
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double a=0;
        double b=0;
        int c,d;
        c=nums1.length;
        d=nums2.length;
        if (c==0)
        {
            a=0.0;
        }
        else {
            if ((c%2)==0)
            {
                a=(nums1[c/2]+nums1[(c/2)-1])/2.0;
            }else
            {
                a=nums1[(c/2)];
            }
        }
        if (d==0)
        {
            b=0.0;
        }
        else {
            if ((d%2)==0)
            {
                b=(nums2[d/2]+nums2[(d/2)-1])/2.0;
            }else
            {
                b=nums2[(d/2)];
            }
        }
        if (c==0)
        {
            return b;
        }
        if (d==0)
        {
            return a;
        }
        return (a+b)/2;
    }

}
