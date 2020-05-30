package leetcode1;

import org.junit.Test;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 *
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 *
 */
public class LeetCode242 {

    @Test
    public void say()
    {
        String s="anagram";
        String t="nagaram";
        isAnagram(s,t);
        int[] a=new int[24];
        a[0]--;
        System.out.println(a[0]);
        a[0]++;
        System.out.println(a[0]);
    }

    public boolean isAnagram(String s, String t) {
        //定义一个数组
        int[] arr = new int[26];
        //
        for(char c: s.toCharArray()){
            arr[c-'a']++;
        }
        //
        for(char c: t.toCharArray()){
            arr[c-'a']--;
        }
        for(int n: arr){
            if(n!=0) return false;
        }
        return true;
    }

}
