package leetcode1;

/**
 * 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
 *
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 *
 *  
 *
 * 示例:
 *
 * board =
 * [
 *   ['A','B','C','E'],
 *   ['S','F','C','S'],
 *   ['A','D','E','E']
 * ]
 *
 * 给定 word = "ABCCED", 返回 true
 * 给定 word = "SEE", 返回 true
 * 给定 word = "ABCB", 返回 false
 *
 */
public class LeetCode79 {

    public boolean exist(char[][] board, String word) {
        if (board==null || board.length==0)
        {
            return false;
        }
        return dsf(board,word,0,0);
    }

    public boolean dsf(char[][] board,String word,int start,int end)
    {
        if (board==null)
        {
            return false;
        }
        word=word.substring(0,1);
        if (board[start][end]==word.charAt(0))
        {

        }
        return false;
    }

}
