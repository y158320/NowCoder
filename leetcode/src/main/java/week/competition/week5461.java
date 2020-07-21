package week.competition;

import org.junit.Test;

/**
 * 给你一个二进制字符串 s（仅由 '0' 和 '1' 组成的字符串）。
 *
 * 返回所有字符都为 1 的子字符串的数目。
 *
 * 由于答案可能很大，请你将它对 10^9 + 7 取模后返回。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "0110111"
 * 输出：9
 * 解释：共有 9 个子字符串仅由 '1' 组成
 * "1" -> 5 次
 * "11" -> 3 次
 * "111" -> 1 次
 * 示例 2：
 *
 * 输入：s = "101"
 * 输出：2
 * 解释：子字符串 "1" 在 s 中共出现 2 次
 * 示例 3：
 *
 * 输入：s = "111111"
 * 输出：21
 * 解释：每个子字符串都仅由 '1' 组成
 * 示例 4：
 *
 * 输入：s = "000"
 * 输出：0
 */
public class week5461 {

    @Test
    public void test()
    {
        System.out.println(numSub("0110111"));
    }
//    int countLetters(string S) {
//        char a = S[0];
//        int res=0, temp = 0;
//        for(auto c:S){
//            if(a==c){
//                temp++;
//                res+=temp;
//            }
//            else {
//                temp=1;
//                res++;
//                a = c;
//            }
//        }
//        return res;

    public int numSub(String s) {
       if (s==null || "".equals(s))
       {
           return 0;
       }
       int[] a=new int[s.length()];
       int b=0;
       int tes=0;
       char[] str=s.toCharArray();
       for (int i=0;i<str.length-1;i++)
       {
           if (str[i]==str[i+1])
           {
               b=b+1;
           }else
           {
               a[i]=b;
               b=0;
           }
       }
       for (int i=0;i<a.length;i++)
       {
           tes=tes+(1+a[i])*a[i]/2;
       }
       return tes;
    }

}
