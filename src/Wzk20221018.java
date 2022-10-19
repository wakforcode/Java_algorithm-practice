/**
 * @author wzk
 * @description
 * @Date 2022/9/21 17:45
 */
public class Wzk20221018 {

    /**
     * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
     * <p>
     * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
     * <p>
     * 假设环境不允许存储 64 位整数（有符号或无符号）。
     * <p>
     * 示例 1：
     * 输入：x = 123
     * 输出：321
     * <p>
     * 示例 2：
     * 输入：x = -123
     * 输出：-321
     * <p>
     * 示例 3：
     * 输入：x = 120
     * 输出：21
     * <p>
     * 示例 4：
     * 输入：x = 0
     * 输出：0
     * <p>
     * <p>
     * 如果反转后整数超过 2的32 位的有符号整数的范围 [−2的31次方,  2的（31 − 1）次方] ，就返回 0。
     *
     * @param x
     */
    public int reverse(int x) {

        if (0 <= x && x < 10) {
            return x;
        } else {
            boolean isFushu = x < 0;
            if (isFushu) {
                x = -x;
            }
            long a = 0;
            while (x / 10 > 0 || x != 0) {
                a = a * 10 + x % 10;
                x = x / 10;
            }
            a = isFushu ? -a : a;
            if (Integer.MIN_VALUE > a || Integer.MAX_VALUE < a) {
                return 0;

            } else {
                return (int) a;
            }
        }
    }


    /**
     * 给定一个包含 [0, n]中n个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
     * <p>
     * 示例 1：
     * 输入：nums = [3,0,1]
     * 输出：2
     * 解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。2 是丢失的数字，因为它没有出现在 nums 中。
     * <p>
     * 示例 2：
     * 输入：nums = [0,1]
     * 输出：2
     * 解释：n = 2，因为有 2 个数字，所以所有的数字都在范围 [0,2] 内。2 是丢失的数字，因为它没有出现在 nums 中。
     * <p>
     * 示例 3：
     * 输入：nums = [9,6,4,2,3,5,7,0,1]
     * 输出：8
     * 解释：n = 9，因为有 9 个数字，所以所有的数字都在范围 [0,9] 内。8 是丢失的数字，因为它没有出现在 nums 中。
     * <p>
     * 示例 4：
     * 输入：nums = [0]
     * 输出：1
     * 解释：n = 1，因为有 1 个数字，所以所有的数字都在范围 [0,1] 内。1 是丢失的数字，因为它没有出现在 nums 中。
     * <p>
     * 提示：
     * n == nums.length
     * 1 <= n <= 104
     * 0 <= nums[i] <= n
     * nums 中的所有数字都 独一无二
     *
     * @param nums
     */
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int sum = 0;
        int allSum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            allSum += i + 1;
        }
        return allSum - sum;
    }


    /**
     * 给你一个字符串 s，找到 s 中最长的回文子串。
     * 示例 1：
     * 输入：s = "babad"
     * 输出："bab"
     * 解释："aba" 同样是符合题意的答案。
     * <p>
     * 示例 2：
     * 输入：s = "cbbd"
     * 输出："bb"
     * <p>
     * 提示：
     * 1 <= s.length <= 1000
     * s 仅由数字和英文字母组成
     *
     * @param s
     */
    public String longestPalindrome(String s) {

        char[] chars = s.toCharArray();
        int p = 0;
        int q = 0;

        int maxLength = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = chars.length - 1; j >= 0; j--) {
                if (chars[i] == chars[j] && i < j) {
                    if (j - i + 1 > maxLength) {
                        if (isPalindrome(s.substring(i, j + 1))) {
                            p = i;
                            q = j;
                            maxLength = j - i + 1;
                        }
                    }
                }
            }
        }
        return s.substring(p, q + 1);

    }

    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int p = 0;
        int q = chars.length - 1;
        while (chars[p] == chars[q]) {
            if (p + 1 == q || p == q) {
                return true;
            } else {
                p++;
                q--;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        Wzk20221018 wzk = new Wzk20221018();

//        int reverse = wzk.reverse(-123);

        String abccba = wzk.longestPalindrome("aacabdkacaa");
        System.out.println(abccba);
    }

}
