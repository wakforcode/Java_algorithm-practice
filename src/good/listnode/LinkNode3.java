package good.listnode;

import java.util.Stack;

/**
 * @author wzk
 * @ClassName good.listnode.LinkNode2.java
 * @Description 翻转链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * @createTime 2021年12月22日 16:22:00
 */
public class LinkNode3 {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
     * <p>
     * 示例1：
     * <p>
     * 输入：1->2->4, 1->3
     * 输出：1->1->2->3->4
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        Stack<ListNode> stack = new Stack<>();

        ListNode temp = null;
        while (l1 != null || l2 != null) {

            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    temp = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    temp = new ListNode(l2.val);
                    l2 = l2.next;
                }
            } else if (l2 == null) {
                temp = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                temp = new ListNode(l2.val);
                l2 = l2.next;
            }
            stack.push(temp);
        }

        ListNode returnLisNode = stack.pop();
        while (!stack.empty()){
            ListNode temp2 = stack.pop();
            temp2.next = returnLisNode;
            returnLisNode = temp2;
        }

        return returnLisNode;

    }


    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {

//        if (l1 == null) {
//            return l2;
//        }
//        if (l2 == null) {
//            return l1;
//        }
//
//
//        good.listnode.ListNode temp = null;
//        while (l1 != null || l2 != null) {
//
//            if (l1 != null && l2 != null) {
//                if (l1.val <= l2.val) {
//                    temp = new good.listnode.ListNode(l1.val);
//                    l1 = l1.next;
//                } else {
//                    temp = new good.listnode.ListNode(l2.val);
//                    l2 = l2.next;
//                }
//            } else if (l2 == null) {
//                temp = new good.listnode.ListNode(l1.val);
//                l1 = l1.next;
//            } else {
//                temp = new good.listnode.ListNode(l2.val);
//                l2 = l2.next;
//            }
//        }
//
        return null;

    }

}
