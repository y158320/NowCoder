package leetcode1;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 */
public class LeetCode3 {

    @Test
    public void say()
    {
        lengthOfLongestSubstring("poiuytrewq");
    }

    public int lengthOfLongestSubstring(String s) {
        int a=0;
        int b=0;
        Set<String> set=new HashSet<>();
        for (int i=0;i<s.length()-1;i++)
        {
            set.add(s.substring(i,i+1));
            a=1;
            for (int j=i+1;j<s.length();j++)
            {
                if (set.add(s.substring(j,j+1)))
                {
                  a=a+1;
                }else
                {
                  if (a>b)
                  {
                      b=a;
                  }
                  break;
                }
            }
        }
        System.out.println(b);
        return b;
    }

}
