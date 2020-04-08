package leetcode1;

import org.junit.Test;

/**
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 *
 *  
 *
 * 示例 1：
 *
 * 输入：m = 2, n = 3, k = 1
 * 输出：3
 * 示例 1：
 *
 * 输入：m = 3, n = 1, k = 0
 * 输出：1
 *
 */
public class LeetCode面试题13 {

    @Test
    public void say()
    {
        System.out.println(movingCount(3,2,17));
    }

    boolean[][] visited;
    public int movingCount1(int m, int n, int k) {
        visited = new boolean[m][n];
        return dfs(0, 0, m, n, k);
    }

    private int dfs(int x, int y, int m, int n, int k) {
        if (x >= m || y >= n || visited[x][y]
                || (x % 10 + x / 10 + y % 10 + y / 10) > k) {
            return 0;
        }
        visited[x][y] = true;
        return 1 + dfs(x + 1, y, m, n, k) + dfs(x, y + 1, m, n, k);
    }

    public int movingCount(int m, int n, int k) {
        boolean[][] visit = new boolean[m][n];
        return dsf(0,0,m,n,k);
    }

    public int dsf(int x,int y,int m,int n,int k)
    {
        if (x>=m || y>=n || (x/10 + x%10 + y/10 + y%10) > k )
        {
            return 0;
        }
//        visit[x][y]
        return dsf(x+1,y,m,n,k)+dsf(x,y+1,m,n,k)+1;
    }

}
