package leetcode1;

import org.junit.Test;

/**
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 *
 */
public class LeetCode234 {

    @Test
    public void say()
    {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        listNode1.next=listNode2;
        isPalindrome(listNode1);
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        {
            return false;
        }
        ListNode listNode=null;
        ListNode temp=head;
        while (head!=null)
        {
            ListNode listNode1=new ListNode(head.val);
            listNode1.next=listNode;
            listNode=listNode1;
            head=head.next;
        }
        while (temp!=null)
        {
            if (temp.val==listNode.val)
            {
                temp=temp.next;
                listNode=listNode.next;
            }else
            {
                return false;
            }
        }
        return true;
    }

}
