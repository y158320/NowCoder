package leetcode1;

import org.junit.Test;

/**
 * 给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 *
 *  
 *
 * 示例：
 *
 * 输入：
 * A: [1,2,3,2,1]
 * B: [3,2,1,4,7]
 * 输出：3
 * 解释：
 * 长度最长的公共子数组是 [3, 2, 1] 。
 *
 */
public class LeetCode718 {

    @Test
    public void say()
    {
        int[] A={5,14,53,80,48};
        int[] B={50,47,3,80,83};
        findLength(A,B);
    }

    public int findLength(int[] A, int[] B) {
       if (A==null || B==null)
       {
           return 0;
       }
       int[][] newTable=new int[A.length][B.length];
       int res=0;
       for (int i=0;i<A.length;i++)
       {
           for (int j=0;j<B.length;j++)
           {
               if(A[i]==B[j])
               {
                   if (i==0 || j==0)
                   {
                       newTable[i][j]=1;
                       res=Math.max(res,1);
                   }else if (newTable[i-1][j-1]!=0)
                   {
                       newTable[i][j]=newTable[i-1][j-1]+1;
                       res=Math.max(res,newTable[i][j]);
                   }else
                   {
                       newTable[i][j]=1;
                       res=Math.max(res,1);
                   }
               }
           }
       }
       return res;
    }

}
