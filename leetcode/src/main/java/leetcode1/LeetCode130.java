package leetcode1;

import org.junit.Test;

/**
 * 给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
 *
 * 找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
 *
 * 示例:
 *
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * 运行你的函数后，矩阵变为：
 *
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 * 解释:
 *
 * 被围绕的区间不会存在于边界上，换句话说，任何边界上的 'O' 都不会被填充为 'X'。 任何不在边界上，或不与边界上的 'O' 相连的 'O' 最终都会被填充为 'X'。如果两个元素在水平或垂直方向相邻，则称它们是“相连”的。
 *
 */
public class LeetCode130 {

    @Test
    public void say()
    {
        char[][] board=new char[4][4];
        board[0][0]='X';
        board[0][1]='X';
        board[0][2]='X';
        board[0][3]='X';
        board[1][0]='X';
        board[1][1]='O';
        board[1][2]='O';
        board[1][3]='X';
        board[2][0]='X';
        board[2][1]='X';
        board[2][2]='X';
        board[2][3]='X';
        board[3][0]='O';
        board[3][1]='X';
        board[3][2]='X';
        board[3][3]='X';
        solve(board);
    }

    public void solve(char[][] board) {
      if (board==null)
      {
          return;
      }
      for (int i=0;i<board.length;i++)
      {
          for (int j=0;j<board[0].length;j++)
          {
              dfs(i,j,board);
          }
      }
        System.out.println(board);
    }

    public void dfs(int x,int y,char[][] board)
    {
        if (x<0 || x>board.length || y<0 || y>board[0].length || board[x][y]!='O')
        {
            return;
        }
        if ((board[x][y]=='O'&&x==0) || (x==board.length&&board[x][y]=='O') || (board[x][y]=='O'&&y==0) || (y==board[0].length&&board[x][y]=='O'))
        {
            board[x][y]='1';
        }
        dfs(x-1,y,board);
        dfs(x+1,y,board);
        dfs(x,y-1,board);
        dfs(x,y+1,board);
    }


    public void solve1(char[][] board) {
        if(board == null || board.length == 0) return;
        int m = board.length;
        int n = board[0].length;
        for(int i = 0; i < board.length; ++ i) {
            if(board[i][0] == 'O') dfs(board, i, 0);
            if(board[i][board[0].length-1] == 'O') dfs(board, i, board[0].length-1);
        }

        for(int i = 0; i < board[0].length; ++ i) {
            if(board[0][i] == 'O') dfs(board, 0, i);
            if(board[board.length-1][i] == 'O') dfs(board, board.length-1, i);
        }

        for(int i = 0; i < m; ++ i) {
            for(int j = 0; j < n; ++ j) {
                if(board[i][j] == 'O') board[i][j] = 'X';
                else if(board[i][j] == '-') board[i][j] = 'O';
            }
        }
    }

    public void dfs(char[][] board, int i, int j) {
        board[i][j] = '-';

        if(i-1 >= 0 && board[i-1][j] == 'O') {
            dfs(board, i-1, j);
        }
        if(i+1 < board.length && board[i+1][j] == 'O') {
            dfs(board, i+1, j);
        }
        if(j-1 >= 0 && board[i][j-1] == 'O') {
            dfs(board, i, j-1);
        }
        if(j+1 < board[0].length && board[i][j+1] == 'O') {
            dfs(board, i, j+1);
        }
    }

}
