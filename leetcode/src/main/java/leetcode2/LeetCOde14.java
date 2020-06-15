package leetcode2;

import org.junit.Test;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 */
public class LeetCOde14 {

    @Test
    public void say()
    {
        String[] s={"flower","flow","flight"};
        longestCommonPrefix1(s);
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String[] s = new String[strs[0].length() + 1];
        for (int i = 0; i < s.length; i++) {
            s[i] = strs[0].substring(0, i);
        }
        int k = s.length - 1;
        for (int i = 1; i < strs.length; i++) {
            for (int j = k; j >= 0; j--) {
                if (strs[i].length() < j) {
                    continue;
                }
                if (strs[i].substring(0, j).equals(s[j])) {
                    k = j;
                    break;
                }
            }
        }
        return s[k];
    }

    public String longestCommonPrefix1(String[] strs) {
        if(strs.length == 0)
            return "";
        String ans = strs[0];
        for(int i =1;i<strs.length;i++) {
            int j=0;
            for(;j<ans.length() && j < strs[i].length();j++) {
                if(ans.charAt(j) != strs[i].charAt(j))
                    break;
            }
            ans = ans.substring(0, j);
            if(ans.equals(""))
                return ans;
        }
        return ans;
    }

}
