package good.listnode;

import java.util.ArrayList;
import java.util.List;
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
public class LinkNode2 {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 翻转链表
     *
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {

        /**
         * 1->2->3->4->5
         * 5->4->3->2->1
         */
        if (head == null) {
            return new int[]{};
        }

        List<Integer> aa = new ArrayList<>();
        ListNode currentNode = new ListNode(head.val);
        while (head != null) {
            currentNode = getNextNode(head, currentNode);
            head = head.next;
        }
        while (currentNode != null) {

            aa.add(currentNode.val);
            currentNode = currentNode.next;
        }
        return aa.stream().mapToInt(Integer::intValue).toArray();
    }

    private ListNode getNextNode(ListNode head, ListNode current) {
        if (head.next != null) {
            ListNode temp = new ListNode(head.next.val);
            temp.next = current;
            current = temp;
        }
        return current;
    }


    /**
     * 利用栈的特性 先进后出
     *
     * @param head
     * @return
     */
    public int[] reversePrint2(ListNode head) {
        if (head == null) {
            return new int[]{};
        }

        Stack<Integer> s = new Stack<Integer>();

        while (head != null) {
            s.push(head.val);
            head = head.next;
        }
        int size = s.size();
        int[] aaa = new int[size];
        for (int i = 0; i < size; i++) {
            aaa[i] = s.pop();
        }
        return aaa;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
//        good.listnode.ListNode l4 = new good.listnode.ListNode(8);
//        good.listnode.ListNode l5 = new good.listnode.ListNode(12);
        l1.next = l2;
        l2.next = l3;
        LinkNode2 linkNode2 = new LinkNode2();
        linkNode2.reversePrint2(l1);
    }
}
