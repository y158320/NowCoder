package leetcode1;

import org.junit.Test;

/**
 * 给出一个区间的集合，请合并所有重叠的区间。
 *
 * 示例 1:
 *
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 示例 2:
 *
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 *
 */
public class LeetCode56 {

    @Test
    public void say()
    {
        int[][] intervals=new int[100][100];
        intervals[0][0]=1;
    }

    public int[][] merge(int[][] intervals) {
       if (intervals==null || intervals.length<1)
       {
           return null;
       }

       return null;
    }

}
