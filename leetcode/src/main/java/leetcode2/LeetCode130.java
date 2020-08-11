package leetcode2;

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

    public void solve(char[][] board) {

       if (board==null)
       {
           return;
       }
       for (int i=0;i<board.length;i++)
       {
           dfs(board,i,0);
           dfs(board,i,board[0].length);
       }
       for (int j=0;j<board[0].length;j++)
       {
           dfs(board,0,j);
           dfs(board,board.length,j);
       }
       for (int i=0;i<board.length;i++)
       {
           for (int j=0;j<board[0].length;j++){
               if(board[i][j]=='O')
                   board[i][j]='X';
               if(board[i][j]=='-')
                   board[i][j]='O';
           }
       }
    }
//https://www.cnblogs.com/itsharehome/p/11058010.html
    public void dfs(char[][] board,int x,int y)
    {
        if (x<0 || y<0 || x>board.length || y>board[0].length || board[x][y]=='X')
        {
            return;
        }
        board[x][y]='-';
        dfs(board,x-1,y);
        dfs(board,x+1,y);
        dfs(board,x,y-1);
        dfs(board,x,y+1);
    }

}
