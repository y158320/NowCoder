package leetcode1;

import org.junit.Test;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 *
 *
 *
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 *
 * 说明：m 和 n 的值均不超过 100。
 *
 * 示例 1:
 *
 * 输入:
 * [
 *   [0,0,0],
 *   [0,1,0],
 *   [0,0,0]
 * ]
 * 输出: 2
 * 解释:
 * 3x3 网格的正中间有一个障碍物。
 * 从左上角到右下角一共有 2 条不同的路径：
 * 1. 向右 -> 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右 -> 向右
 */
public class LeetCode63 {

    @Test
    public void say()
    {
        int[][] a=new int[4][4];
        a[0][0]=1;
        System.out.println(uniquePathsWithObstacles(a));
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      if(null==obstacleGrid || obstacleGrid.length==0)
      {
          return 0;
      }
      return dfs(0,0,obstacleGrid,0);
    }

    public int dfs(int x,int y,int[][] obstacleGrid,int num)
    {
        if (x==obstacleGrid.length-1 && y<obstacleGrid[x].length-1)
        {
            return dfs(x,y+1,obstacleGrid,num);
        }
        if (x<obstacleGrid.length-1 && y==obstacleGrid[x].length-1)
        {
            return dfs(x+1,y,obstacleGrid,num);
        }
        if (x==obstacleGrid.length-1 && y==obstacleGrid[x].length-1 && obstacleGrid[x][y]==0)
        {
            num=num+1;
            return num;
        }
        if (obstacleGrid[x][y]==1)
        {
            return num;
        }
        return dfs(x+1,y,obstacleGrid,num)+dfs(x,y+1,obstacleGrid,num);
    }

    public int uniquePathsWithObstacles1(int[][] obstacleGrid) {
        if(null == obstacleGrid || 0 == obstacleGrid.length)return 1;
        if(0 == obstacleGrid[0].length)return 1;

        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[] dp = new int[n]; dp[0] = 1;
        for(int i = 0; i < m; ++i){
            if(1 == obstacleGrid[i][0])dp[0] = 0;
            for(int j = 1; j < n; ++j){
                if(0 == obstacleGrid[i][j])dp[j] += dp[j-1];
                else dp[j] = 0;
            }
        }
        return dp[n-1];
    }


}
