package moni;

/**
 * 给定一个整数数组 A，返回 A 中最长等差子序列的长度。
 *
 * 回想一下，A 的子序列是列表 A[i_1], A[i_2], ..., A[i_k] 其中 0 <= i_1 < i_2 < ... < i_k <= A.length - 1。并且如果 B[i+1] - B[i]( 0 <= i < B.length - 1) 的值都相同，那么序列 B 是等差的。
 *
 *
 *
 * 示例 1：
 *
 * 输入：[3,6,9,12]
 * 输出：4
 * 解释：
 * 整个数组是公差为 3 的等差数列。
 * 示例 2：
 *
 * 输入：[9,4,7,2,10]
 * 输出：3
 * 解释：
 * 最长的等差子序列是 [4,7,10]。
 * 示例 3：
 *
 * 输入：[20,1,15,3,10,5,8]
 * 输出：4
 * 解释：
 * 最长的等差子序列是 [20,15,10,5]。
 */
public class MoNi3 {

    public int longestArithSeqLength(int[] A) {
        int m = A.length;
        //dp[i][j] 表示到第i个数 且公差为j的最长值
        int[][] dp = new int[m][20002];
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = i-1; j >= 0; j--) {
                int a = A[i] - A[j];
                if (a<0){
                    dp[i][1000 + a * -1] = Math.max(dp[j][1000 + a * -1] + 1, dp[i][1000 + a * -1]);
                    res = Math.max(res, dp[i][1000 + a * -1]);
                } else{
                    dp[i][a] = Math.max(dp[j][a] + 1,dp[i][a]);
                    res = Math.max(dp[i][a], res);
                }
            }
        }
        return res+1;
    }
}
