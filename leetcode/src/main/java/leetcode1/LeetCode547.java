package leetcode1;

import org.junit.Test;

import java.util.Arrays;

/**
 * 班上有 N 名学生。其中有些人是朋友，有些则不是。他们的友谊具有是传递性。如果已知 A 是 B 的朋友，B 是 C 的朋友，那么我们可以认为 A 也是 C 的朋友。所谓的朋友圈，是指所有朋友的集合。
 *
 * 给定一个 N * N 的矩阵 M，表示班级中学生之间的朋友关系。如果M[i][j] = 1，表示已知第 i 个和 j 个学生互为朋友关系，否则为不知道。你必须输出所有学生中的已知的朋友圈总数。
 *
 * 示例 1:
 *
 * 输入:
 * [[1,1,0],
 *  [1,1,0],
 *  [0,0,1]]
 * 输出: 2
 * 说明：已知学生0和学生1互为朋友，他们在一个朋友圈。
 * 第2个学生自己在一个朋友圈。所以返回2。
 * 示例 2:
 *
 * 输入:
 * [[1,1,0],
 *  [1,1,1],
 *  [0,1,1]]
 * 输出: 1
 * 说明：已知学生0和学生1互为朋友，学生1和学生2互为朋友，所以学生0和学生2也是朋友，所以他们三个在一个朋友圈，返回1。
 * 注意：N 在[1,200]的范围内。
 * 对于所有学生，有M[i][i] = 1。
 * 如果有M[i][j] = 1，则有M[j][i] = 1。
 *
 */
public class LeetCode547 {

    @Test
    public void say()
    {
        System.out.println("112");
        int[][] M=new int[3][3];
        M[0][0]=1;
        M[0][1]=1;
        M[0][2]=0;
        M[1][0]=1;
        M[1][1]=1;
        M[1][2]=1;
        M[2][0]=0;
        M[2][1]=1;
        M[2][2]=1;
        findCircleNum(M);
    }

    public void dfs(int[][] M, int[] visited, int i) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(M, visited, j);
            }
        }
    }
    public int findCircleNum11(int[][] M) {
        int[] visited = new int[M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }

    int[] hasFriend;
    int[][] Matrix;
    int length;
    int count=0;
    int num=0;
    public int findCircleNum(int[][] M) {
        hasFriend=new int[M.length];
        Arrays.fill(hasFriend,-1);
        Matrix=M;
        length=M.length;
        for(int i=0;i<length;i++){
            if(hasFriend[i]==-1)
            {
                 helper(i);
                if(count>0)
                {num++;}
            }
        }
        return num;
    }
    public void helper(int N){
        boolean hasChild=false;
        hasFriend[N]=1;
        for(int i=0;i<length;i++){
            if(Matrix[N][i]==1&&N!=i&&hasFriend[i]==-1){hasFriend[i]=1;hasChild=true;helper(i);}
        }
        if(!hasChild) count++;
    }

}
