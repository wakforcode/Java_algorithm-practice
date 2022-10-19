import java.util.HashMap;
import java.util.Map;

/**
 * @author wzk
 * @description
 * @Date 2022/9/21 17:45
 */
public class Wzk20221017 {

    /**
     * 给你一个整数n，请你返回 任意一个由 n个 各不相同的整数组成的数组，并且这 n 个数相加和为 0 。
     * 1 <= n <= 1000
     * <p>
     * 输入：n = 5         [-2,-1,0,1,2]
     * 输出：[-7,-1,1,3,4]
     * 解释：这些数组也是正确的 [-5,-1,1,2,3]，[-3,-1,2,-2,4]。
     * <p>
     * 输入：n = 3
     * 输出：[-1,0,1]
     * <p>
     * 输入：n = 1
     * 输出：[0]
     *
     * @param n
     */

    public int[] sumZero(int n) {

        if (n == 1) {
            return new int[]{0};
        } else {
            int[] ints = new int[n];
            int maxNum = n / 2;

            boolean isou = n % 2 == 0;

            for (int i = 0; i <= n - 1; i++) {
                ints[i] = -maxNum + i;
                if (isou && ints[i] >= 0) {
                    ints[i] = ints[i] + 1;
                }
            }
            return ints;
        }
    }


    /**
     * 已知函数 signFunc(x) 将会根据 x 的正负返回特定值：
     * <p>
     * 如果 x 是正数，返回 1 。
     * 如果 x 是负数，返回 -1 。
     * 如果 x 是等于 0 ，返回 0 。
     * 给你一个整数数组 nums 。令 product 为数组 nums 中所有元素值的乘积。
     * <p>
     * 返回 signFunc(product) 。
     * <p>
     * 输入：nums = [-1,-2,-3,-4,3,2,1]
     * 输出：1
     * 解释：数组中所有值的乘积是 144 ，且 signFunc(144) = 1
     * <p>
     * 输入：nums = [1,5,0,2,-3]
     * 输出：0
     * 解释：数组中所有值的乘积是 0 ，且 signFunc(0) = 0
     * <p>
     * 输入：nums = [-1,1,-1,1,-1]
     * 输出：-1
     * 解释：数组中所有值的乘积是 -1 ，且 signFunc(-1) = -1
     *
     * @param nums
     */

    public int arraySign(int[] nums) {

        int fuNum = 0;

        for (int i = 0; i <= nums.length - 1; i++) {

            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                fuNum++;
            }
        }
        if (fuNum % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }


    /**
     * 给你一个字符串columnTitle ，表示 Excel 表格中的列名称。返回 该列名称对应的列序号
     * <p>
     * 例如：
     * <p>
     * A -> 1
     * B -> 2
     * C -> 3
     * ...
     * Z -> 26
     * AA -> 27
     * AB -> 28
     * ...
     * <p>
     * 输入: columnTitle = "AAA"
     * 输出: 1
     * <p>
     * <p>
     * 输入: columnTitle = "AB"
     * 输出: 28
     * <p>
     * 输入: columnTitle = "ZY"
     * 输出: 701
     *    F = 6 *1 + 0
     *   FX = 26*6 +23
     * <p>
     * 提示：
     * <p>
     * 1 <= columnTitle.length <= 7
     * columnTitle 仅由大写英文组成
     * columnTitle 在范围 ["A", "FXSHRXW"] 内
     *
     * @param columnTitle
     */


    public int titleToNumber(String columnTitle) {

        int num = 0;

        int a = 1;

        for (int i = 0; i <= columnTitle.length() - 1; i++) {
            int index = columnTitle.charAt(i) - 'A' + 1;
            num += index*a;
            a *= 26;
        }
        return num;
    }


    public static void main(String[] args) {

        Wzk20221017 wzk20221017 = new Wzk20221017();
        int[] nums = new int[]{-1,1,-1,1,-1};
        int i = wzk20221017.arraySign(nums);
        System.out.println(i);
//
//
//
//        int[] ints = wzk20221017.sumZero(4);
//        System.out.println();
//        int i = "COLUMNTITLE".charAt(2) - 'A' + 1;
//        System.out.println(i);
    }

}
