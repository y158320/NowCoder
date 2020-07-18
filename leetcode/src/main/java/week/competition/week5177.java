package week.competition;

import org.junit.Test;

/**
 * 给你一个字符串 date ，它的格式为 Day Month Year ，其中：
 *
 * Day 是集合 {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"} 中的一个元素。
 * Month 是集合 {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"} 中的一个元素。
 * Year 的范围在 ​[1900, 2100] 之间。
 * 请你将字符串转变为 YYYY-MM-DD 的格式，其中：
 *
 * YYYY 表示 4 位的年份。
 * MM 表示 2 位的月份。
 * DD 表示 2 位的天数。
 *
 *
 * 示例 1：
 *
 * 输入：date = "20th Oct 2052"
 * 输出："2052-10-20"
 * 示例 2：
 *
 * 输入：date = "6th Jun 1933"
 * 输出："1933-06-06"
 * 示例 3：
 *
 * 输入：date = "26th May 1960"
 * 输出："1960-05-26"
 */
public class week5177 {

    @Test
    public void say()
    {
//        String dates="20th";
//        dates=dates.substring(0,dates.length()-2);
//        System.out.println(dates);
        System.out.println(reformDate("26th May 1960"));
    }

    public String reformDate(String date){
        if (date==null || "".equals(date))
        {
            return "";
        }
        String[] dates=date.split(" ");
        dates[0]=dates[0].substring(0,dates[0].length()-2);
        String b="";
        if (dates[0].length()==1){
            dates[0]="0"+dates[0];
        }
        String a="";
        switch (dates[1])
        {
            case "Jan" : a="1";break;
            case "Feb" : a="2";break;
            case "Mar" : a="3";break;
            case "Apr" : a="4";break;
            case "May" : a="5";break;
            case "Jun" : a="6";break;
            case "Jul" : a="7";break;
            case "Aug" : a="8";break;
            case "Sep" : a="9";break;
            case "Oct" : a="10";break;
            case "Nov" : a="11";break;
            case "Dec" : a="12";break;
        }
        return dates[2]+"-"+a+"-"+dates[0];
    }

}
