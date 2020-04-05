package leetcode1;

import org.junit.Test;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * 李明现在根本不知道自己应该去哪里找人才
 *
 */
public class LeetCode21 {

    @Test
    public void say()
    {
        ListNode listNode=new ListNode(1);
        ListNode listNode1=new ListNode(2);
        ListNode listNode2=new ListNode(4);
        listNode.next=listNode1;
        listNode1.next=listNode2;
        mergeTwoLists(listNode,listNode);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode listNode=new ListNode(0);
        while (l1.next!=null || l2.next!=null )
        {
            if (l1.val<=l2.val)
            {
                listNode.next=new ListNode(0);
                listNode.val=l1.val;
                l1=l1.next;
            }
            else {
                listNode.next=new ListNode(0);
                listNode.val=l2.val;
                l2=l2.next;
            }
        }
        if (l1.val!=0){
            listNode.next=new ListNode(0);
            listNode.val=l1.val;
        }
        else if(l2.val!=0)
        {
            listNode.next=new ListNode(0);
            listNode.val=l2.val;
        }
        return listNode;
    }

}
