package listnode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wzk
 * @ClassName listnode.ListNode.java
 * @Description 翻转链表
 * @createTime 2021年08月10日 10:04:00
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode(Integer x) {
        val = x;
    }

    public static ListNode reverseList(ListNode head) {
        /**
         * 1->2->3->4->5
         * 5->4->3->2->1
         */
        ListNode cur = new ListNode(head.val);
        ListNode temp = null;
        while (head.next != null) {
            temp = new ListNode(head.next.val);
            temp.next = cur;
            cur = temp;
            head = head.next;
        }
        return cur;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l2 == null) {
            return l1;
        } else if (l1 == null) {
            return null;
        } else {
            if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }
        }
    }

    /**
     * Definition for singly-linked list.
     * public class listnode.ListNode {
     * int val;
     * listnode.ListNode next;
     * listnode.ListNode() {}
     * listnode.ListNode(int val) { this.val = val; }
     * listnode.ListNode(int val, listnode.ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        List<ListNode> listNodeList = new ArrayList<>();

        int sum = 0;
        while (l1 != null || l2 != null) {
            ListNode aaa = null;

            if (l1 != null) {
                sum = l1.val + sum;
                l1 = l1.next;

            }
            if (l2 != null) {
                sum = l2.val + sum;
                l2 = l2.next;
            }
            if (sum >= 10) {
                aaa = new ListNode(sum - 10);
                sum = 1;
            } else {
                aaa = new ListNode(sum);
                sum = 0;
            }
            listNodeList.add(aaa);
        }

        if(listNodeList.size()>1){
            ListNode temp = listNodeList.get(listNodeList.size() - 1);

            for (int i = listNodeList.size() - 2; i > 0; i--) {
                ListNode ccc= listNodeList.get(i);
                ccc.next = temp;
                temp = ccc;
            }
            return temp;
        }else {
            return listNodeList.size()==0?null:listNodeList.get(0);
        }


    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
//        listnode.ListNode l4 = new listnode.ListNode(8);
//        listnode.ListNode l5 = new listnode.ListNode(12);
        l1.next = l2;
        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;


        ListNode l11 = new ListNode(7);
        ListNode l22 = new ListNode(6);
        ListNode l33 = new ListNode(4);
//        listnode.ListNode l44 = new listnode.ListNode(4);
//        listnode.ListNode l55 = new listnode.ListNode(9);
        l11.next = l22;
        l22.next = l33;
//        l33.next = l44;
//        l44.next = l55;
        ListNode listNode1 = addTwoNumbers(l1, l11);
        ListNode listNode2 = addTwoNumbers(l1, l11);

//        listnode.ListNode listNode = reverseList(l1);
//        System.out.println(json.toJSONString(listNode));
    }

}
