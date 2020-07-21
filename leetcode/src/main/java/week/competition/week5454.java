package week.competition;

/**
 * 给你一个只包含 0 和 1 的 rows * columns 矩阵 mat ，请你返回有多少个 子矩形 的元素全部都是 1 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：mat = [[1,0,1],
 *             [1,1,0],
 *             [1,1,0]]
 * 输出：13
 * 解释：
 * 有 6 个 1x1 的矩形。
 * 有 2 个 1x2 的矩形。
 * 有 3 个 2x1 的矩形。
 * 有 1 个 2x2 的矩形。
 * 有 1 个 3x1 的矩形。
 * 矩形数目总共 = 6 + 2 + 3 + 1 + 1 = 13 。
 * 示例 2：
 *
 * 输入：mat = [[0,1,1,0],
 *             [0,1,1,1],
 *             [1,1,1,0]]
 * 输出：24
 * 解释：
 * 有 8 个 1x1 的子矩形。
 * 有 5 个 1x2 的子矩形。
 * 有 2 个 1x3 的子矩形。
 * 有 4 个 2x1 的子矩形。
 * 有 2 个 2x2 的子矩形。
 * 有 2 个 3x1 的子矩形。
 * 有 1 个 3x2 的子矩形。
 * 矩形数目总共 = 8 + 5 + 2 + 4 + 2 + 2 + 1 = 24 。
 * 示例 3：
 *
 * 输入：mat = [[1,1,1,1,1,1]]
 * 输出：21
 * 示例 4：
 *
 * 输入：mat = [[1,0,1],[0,1,0],[1,0,1]]
 * 输出：5
 */
public class week5454 {

    int a=0;

    public int numSubmat(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int len = Math.min(m, n);
        boolean[][][] dp = new boolean[m][n][len];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j][0] = (matrix[i][j] == 1);
                count += dp[i][j][0] ? 1 : 0;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < len; k++) {
                    dp[i][j][k] = (matrix[i][j] == 1 && dp[i - 1][j][k - 1] && dp[i][j - 1][k - 1] && dp[i - 1][j - 1] [k - 1]);
                    if (dp[i][j][k]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
