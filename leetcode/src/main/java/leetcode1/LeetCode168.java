package leetcode1;

import org.junit.Test;

/**
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 *
 * 例如，
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     ...
 * 示例 1:
 *
 * 输入: 1
 * 输出: "A"
 * 示例 2:
 *
 * 输入: 28
 * 输出: "AB"
 * 示例 3:
 *
 * 输入: 701
 * 输出: "ZY"
 *
 */
public class LeetCode168 {

    @Test
    public void say()
    {
        convertToTitle(27);
    }

    public String convertToTitle(int n) {
       String a="";
       while (n>0)
    {
       switch (n/26)
       {
           case 0:break;
           case 1:a=a+"A";break;
           case 2:a=a+"B";break;
           case 3:a=a+"C";break;
           case 4:a=a+"D";break;
           case 5:a=a+"E";break;
           case 6:a=a+"F";break;
           case 7:a=a+"G";break;
           case 8:a=a+"H";break;
           case 9:a=a+"I";break;
           case 10:a=a+"J";break;
           case 11:a=a+"K";break;
           case 12:a=a+"L";break;
           case 13:a=a+"M";break;
           case 14:a=a+"N";break;
           case 15:a=a+"O";break;
           case 16:a=a+"P";break;
           case 17:a=a+"Q";break;
           case 18:a=a+"R";break;
           case 19:a=a+"S";break;
           case 20:a=a+"T";break;
           case 21:a=a+"U";break;
           case 22:a=a+"V";break;
           case 23:a=a+"W";break;
           case 24:a=a+"X";break;
           case 25:a=a+"Y";break;
           case 26:a=a+"Z";break;
       }
       if (n<26)
       {
           switch (n%26)
           {
               case 0:
               case 1:a=a+"A";break;
               case 2:a=a+"B";break;
               case 3:a=a+"C";break;
               case 4:a=a+"D";break;
               case 5:a=a+"E";break;
               case 6:a=a+"F";break;
               case 7:a=a+"G";break;
               case 8:a=a+"H";break;
               case 9:a=a+"I";break;
               case 10:a=a+"J";break;
               case 11:a=a+"K";break;
               case 12:a=a+"L";break;
               case 13:a=a+"M";break;
               case 14:a=a+"N";break;
               case 15:a=a+"O";break;
               case 16:a=a+"P";break;
               case 17:a=a+"Q";break;
               case 18:a=a+"R";break;
               case 19:a=a+"S";break;
               case 20:a=a+"T";break;
               case 21:a=a+"U";break;
               case 22:a=a+"V";break;
               case 23:a=a+"W";break;
               case 24:a=a+"X";break;
               case 25:a=a+"Y";break;
               case 26:a=a+"Z";break;
           }
       }
        n=(n-1)/26;
    }
       return a;
    }

    public String convertToTitle1(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.insert(0,(char)('A'+(n-1)%26));
            n = (n-1)/26;
        }
        return sb.toString();
    }

}
