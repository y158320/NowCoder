package leetcode1;

import org.junit.Test;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。
 *
 * 如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指仅由字母组成、不包含任何空格的 最大子字符串。
 *
 *  
 *
 * 示例:
 *
 * 输入: "Hello World"
 * 输出: 5
 *
 */
public class LeetCode58 {

    @Test
    public void say()
    {
        String s="Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String s) {
       if ("".equals(s)|| " ".equals(s))
       {
           return 0;
       }else {
           String[] a=s.split(" ");
           String b=a[a.length-1];
           return b.length();
       }
    }

    public int lengthOfLastWord1(String s) {
        s = s.trim();
        int start = s.lastIndexOf(" ") + 1;
        return s.substring(start).length();
    }
}
