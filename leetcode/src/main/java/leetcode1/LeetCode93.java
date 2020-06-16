package leetcode1;

import java.util.ArrayList;
import java.util.List;

/**
 *给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。
 *
 * 有效的 IP 地址正好由四个整数（每个整数位于 0 到 255 之间组成），整数之间用 '.' 分隔。
 *
 *  
 *
 * 示例:
 *
 * 输入: "25525511135"
 * 输出: ["255.255.11.135", "255.255.111.35"]
 *
 */
public class LeetCode93 {

    public List<String> restoreIpAddresses(String s) {
        return  null;
    }

    List<String> res = new ArrayList<String>();
    public List<String> restoreIpAddresses1(String s) {
        next(s, 0, 0, new StringBuilder());
        return res;
    }

    void next(String s, int start, int pos, StringBuilder sb) {
        if(pos == 4) {
            if(start == s.length())
                res.add(sb.toString().substring(0, sb.length() - 1)); // 去除末尾的点
            return;
        }
        for(int i = start; i < start + 3 && i < s.length(); i++) { // 最多截取三位
            String substr = s.substring(start, i + 1);
            int num = Integer.parseInt(substr);
            if(num > 255) continue; // 最大限制255，剪枝
            sb.append(s.substring(start, i + 1) + ".");
            next(s, i + 1, pos + 1, sb);
            sb.delete(sb.length() - (i - start + 2), sb.length());
            if(s.charAt(start) == '0') break; // 首位是0，剪枝
        }
    }

}
