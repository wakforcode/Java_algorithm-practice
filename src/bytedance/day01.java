package bytedance;

import good.listnode.LinkNode2;

import java.util.List;
import java.util.Stack;

/**
 * @author wzk
 * @description
 * @Date 2023/1/5 12:08
 */
public class day01 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 1->2->3->4->5
     * 5->4->3->2->1
     *
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode temp = new ListNode(head.val);

        while (head.next != null) {
            ListNode a = new ListNode(head.next.val);
            a.next = temp;
            temp = a;
            head = head.next;
        }


//        ListNode b = new ListNode(head.next.next.val);
//        b.next = temp;
//        temp = b;
//
//        ListNode c = new ListNode(head.next.next.next.val);
//        c.next = temp;
//        temp = c;
//
//        ListNode d = new ListNode(head.next.next.next.next.val);
//        d.next = temp;
//        temp = d;

        return temp;
    }


    /**
     * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
     * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
     * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
     * 示例 1：
     * 输入：[7,1,5,3,6,4]
     * 输出：5
     * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
     * 示例 2：
     * 输入：prices = [7,6,4,3,1]
     * 输出：0
     * 解释：在这种情况下, 没有交易完成, 所以最大利润为 0。
     *
     * @param args
     */

    /**
     * 7,2,4,10,1,8
     *
     * @param prices
     * @return
     */

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int maxValue = 0;
        int minNum = prices[0];

        for (int i = 1; i <= prices.length - 1; i++) {
            if (prices[i] > minNum && prices[i] - minNum > maxValue) {
                maxValue = prices[i] - minNum;
            }
            if (minNum > prices[i]) {
                minNum = prices[i];
            }
        }
        return maxValue;

    }


    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1);
//        ListNode l2 = new ListNode(2);
//        ListNode l3 = new ListNode(3);
//        ListNode l4 = new ListNode(4);
//        ListNode l5 = new ListNode(5);
//        l4.next = l5;
//        l3.next = l4;
//        l2.next = l3;
//        l1.next = l2;
//        ListNode listNode = reverseList(l1);
//        System.out.println(listNode);


        int i = maxProfit(new int[]{7, 2, 5, 0});
        System.out.println(i);
    }

}
