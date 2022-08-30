import java.util.ArrayList;
import java.util.List;

/**
 * @author wzk
 * @description
 * @Date 2022/8/30 11:28
 */
public class Wzk20220830 {


    /**
     * 给定一个数组 prices ，它的第i 个元素prices[i] 表示一支给定股票第 i 天的价格。
     * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
     * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
     * <p>
     * 示例 1：
     * 输入：[7,10,80,2,79,1,5,3,6,4]
     * 输出：5
     * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
     * <p>
     * 示例 2：
     * 输入：prices = [7,6,4,3,1]
     * 输出：0
     * 解释：在这种情况下, 没有交易完成, 所以最大利润为 0。
     * <p>
     * 提示：
     * <p>
     * 1 <= prices.length <= 105
     * 0 <= prices[i] <= 104
     */
    public int maxProfit(int[] prices) {


        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
            }
            if (min > prices[i]) {
                min = prices[i];
            }
        }
        return maxProfit;

    }


    /**
     * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     * <p>
     * <p>
     * 示例1：
     * 输入：digits = [1,2,3]
     * 输出：[1,2,4]
     * 解释：输入数组表示数字 123。
     * <p>
     * 示例2：
     * 输入：digits = [4,3,2,9]
     * 输出：[4,3,3,0]
     * 解释：输入数组表示数字 4330。
     * 示例 3：
     * <p>
     * 输入：digits = [0]
     * 输出：[1]
     */
    public int[] plusOne(int[] digits) {

        int lastIndex = digits.length - 1;
        if (digits[lastIndex] == 9) {
            if (lastIndex == 0) {
                digits = new int[]{1, 0};
            } else {
                for (int i = digits.length - 1; i >= 0; i--) {
                    if (digits[i] != 9) {
                        digits[i]++;
                        return digits;
                    } else {
                        if (i == 0) {
                            digits = new int[digits.length + 1];
                            digits[0] = 1;
                        } else {
                            digits[i] = 0;
                        }
                    }
                }
            }
        } else {
            digits[lastIndex] = digits[lastIndex] + 1;
        }

        return digits;
    }


    /**
     * 给你两个二进制字符串，返回它们的和（用二进制表示）。
     * 输入为 非空 字符串且只包含数字1和0。
     * <p>
     * 示例1:
     * 输入: a = "11", b = "01"
     * 输出: "100"
     * <p>
     * 示例2:
     * 输入: a = "1010", b = "1011"
     * 输出: "10101"
     */
    public String addBinary(String a, String b) {

        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int max = Math.max(a.length(), b.length());

        if (a.length() > b.length()) {
            bChars = build(bChars, max);
        } else if (a.length() < b.length()) {
            aChars = build(aChars, max);
        }

        char[] chars = new char[max];

        char temp = '0';

        for (int i = max - 1; i >= 0; i--) {
            // 1
            if (aChars[i] == '1' || bChars[i] == '1') {
                if (aChars[i] == '1' && bChars[i] == '1') {
                    chars[i] = '0';
                } else {
                    chars[i] = '1';
                }
            } else {
                chars[i] = '0';
            }

            //2
            if (temp == '1') {
                if (chars[i] == '1') {
                    chars[i] = '0';
                } else {
                    chars[i] = '1';
                }
            }
            // 3
            if ((aChars[i] == '1' && bChars[i] == '1') || (temp == '1' && chars[i] == '0')) {
                // 进1
                temp = '1';
            } else {
                temp = '0';
            }


        }
        if (temp == '1') {
            char[] chars2 = new char[max + 1];
            for (int j = 0; j <= max; j++) {
                if (j == 0) {
                    chars2[j] = '1';
                } else {
                    chars2[j] = chars[j - 1];
                }
            }
            return String.copyValueOf(chars2);
        }
        return String.copyValueOf(chars);
    }

    private char[] build(char[] aChars, int max) {
        char[] chars = new char[max];
        int num = max - aChars.length;
        for (int i = max - 1; i >= 0; i--) {
            if (i - num >= 0) {
                chars[i] = aChars[i - num];
            }
        }
        return chars;
    }

    public static void main(String[] args) {
        Wzk20220830 wzk = new Wzk20220830();
//        int[] ints = new int[]{7, 1, 5, 3, 6, 4};
//
//        int i = wzk.maxProfit(ints);
//        System.out.println(i);

//        int[] ints = new int[]{8, 9, 9};
//
//        int[] ints1 = wzk.plusOne(ints);
//        System.out.println(ints1);

        String s = wzk.addBinary("1111"
                ,"1111");
        System.out.println(s);


    }


}
