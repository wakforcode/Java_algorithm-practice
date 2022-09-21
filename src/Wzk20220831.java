/**
 * @author wzk
 * @description
 * @Date 2022/8/31 15:15
 */
public class Wzk20220831 {

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
     * 输入：head = [1,1,2,3,3]
     * 输出：[1,2,3]
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode temp = head;

        while (temp.next != null) {

            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public boolean isSameTree(TreeNode p, TreeNode q) {



        p.val=q.val;
        p.left.val=q.left.val;
        p.right.val=q.right.val;
        return false;


    }


    public static void main(String[] args) {
        Wzk20220831 wzk20220831 = new Wzk20220831();

        ListNode listNode5 = new ListNode(3);
        ListNode listNode4 = new ListNode(3, listNode5);
        ListNode listNode3 = new ListNode(2, listNode4);
        ListNode listNode2 = new ListNode(1, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);


        ListNode listNode = wzk20220831.deleteDuplicates(listNode1);

        System.out.println(listNode);


    }

}
