import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author wzk
 * @ClassName Array.java
 * @Description TODO
 * @createTime 2021年08月10日 18:56:00
 */
public class Array {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] returnNum = new int[n + m];
        if (n != 0) {
            int p = 0;
            int q = 0;
            for (int i = 0; i < (m + n); i++) {
                if (p == m) {
                    returnNum[i] = nums2[q];
                    q++;
                } else if (q == n) {
                    returnNum[i] = nums1[p];
                    p++;
                } else if (nums1[p] < nums2[q]) {
                    returnNum[i] = nums1[p];
                    p++;
                } else {
                    returnNum[i] = nums2[q];
                    q++;
                }
            }
        } else {
            returnNum = nums1;
        }
        return returnNum;
    }

    /**
     * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
     * <p>
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/majority-element
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums
     */
    public int majorityElement(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }
        int maxNum = 0;
        int max = 0;
        Map<Integer, Integer> aa = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (aa.get(nums[i]) != null) {
                if (max < aa.get(nums[i]) + 1) {
                    max = aa.get(nums[i]) + 1;
                    maxNum = nums[i];
                }
                aa.put(nums[i], aa.get(nums[i]) + 1);
            } else {
                aa.put(nums[i], 1);
            }
        }
        return maxNum;

    }

    /**
     * 从扑克牌中随机抽5张牌，判断是不是一个顺子，
     * 即这5张牌是不是连续的。
     * 2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/bu-ke-pai-zhong-de-shun-zi-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums
     */
    public static boolean isStraight(int[] nums) {

//        int nextNum = 0;
//        int i = 0;
//        boolean ss = true;
//        while (i < nums.length) {
//            if (nums[i] >= nextNum || nums[i] == 0) {
//                ss = true;
//            } else {
//                ss = false;
//                break;
//            }
//            nextNum = nums[i] + 1;
//            i++;
//        }
        int max = 0;
        int min = 14;
        Set<Integer> aa = new HashSet<>();
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            if (aa.contains(num)) {
                return false;
            } else {
                max = Math.max(num, max);

                min = Math.min(num, min);
                aa.add(num);
            }
        }

        return max - min < 5;
    }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */

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

    /**
     * 找出数组中重复的数字。
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
     * 请找出数组中任意一个重复的数字。
     *
     * @param nums
     */
    public int findRepeatNumber(int[] nums) {

        Map<Integer, Integer> aa = new HashMap<>();
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (aa.get(nums[i]) != null) {
                return nums[i];
            }
            aa.put(nums[i], i);

        }
        return temp;
    }

    /**
     * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
     * <p>
     * 要求时间复杂度为O(n)。
     * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
     *
     * @param nums
     */
    public int maxSubArray(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int pre = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {

            if (pre <= 0) {
                pre = nums[i];
            } else {
                pre = nums[i] + pre;
            }
            if (pre > max) {
                max = pre;
            }
        }
        return max;
    }

    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
     *
     * @param numbers
     */
    public int minArray(int[] numbers) {

        int p = 0;
        int q = numbers.length - 1;
        while (q != p) {
            if (numbers[p] > numbers[q]) {
                p++;
            } else {
                q--;
            }
        }
        return numbers[q];

    }

    /**
     * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
     * <p>
     * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
     * <p>
     * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
     * 输入：[7,1,5,3,6,4]
     * 输出：5
     * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
     *
     * @param prices
     */
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if (length == 0) {
            return 0;
        }
        int p = 0;
        int q = length - 1;
        int aa = 0;
        while (p != q) {
            if (prices[p] > prices[p + 1]) {
                p++;
            }
            if (prices[q] < prices[q - 1]) {
                q--;
            }
            if (aa < prices[q] - prices[p]) {
                aa = prices[q] - prices[p];
            }
        }
        return aa;
    }

    /**
     * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
     * <p>
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     * 说明:
     * 为什么返回数值是整数，但输出的答案是数组呢?
     * <p>
     * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {

        if(nums.length==0){
            return 0;
        }
        int temp = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (temp != nums[i]) {
                nums[count] = nums[i];
                temp = nums[i];
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
//        [-1,0,0,3,3,3,0,0,0]
//        6
//                [1,2,2]
//        3
//        int[] nums1 = new int[]{1, 0, 0, 3, 3, 3, 0, 0, 0};
        int[] nums2 = new int[]{1, 2, 2};
//        int[] merge = merge(nums1, 6, nums2, 3);

        removeDuplicates(nums2);

//        isStraight(new int[]{0, 0, 8, 5, 1});

    }
}
