package good;

/**
 * @author wzk
 * @description
 * @Date 2022/8/29 16:10
 */
public class MySqrt {

    /**
     * 给你一个非负整数 x ，计算并返回x的 算术平方根 。
     * <p>
     * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
     * <p>
     * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
     * <p>
     * 示例 1：
     * 输入：x = 4
     * 输出：2
     * <p>
     * <p>
     * 示例 2：
     * 输入：x = 8
     * 输出：2
     * 解释：8 的算术平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
     * <p>
     * 提示：
     * <p>
     * 0 <= x <= 231 - 1
     *
     * @param x
     * @return
     */

    public int mySqrt(int x) {

        if (x == 1) {
            return 1;
        }
        long left = 1;
        long right = x;
        long mid = 0;
        while (left < right) {
            if (left + 1 == right) {
                return (int) left;
            }
            mid = (left + right) / 2;
            if (mid * mid > x) {
                right = mid;
            } else if (mid * mid == x) {
                return (int) mid;
            } else {
                left = mid;
            }
        }
        return (int) mid;
    }


    public static void main(String[] args) {

        MySqrt mySqrt = new MySqrt();
        long i = mySqrt.mySqrt(2147395599);

        System.out.println(i);
    }

}
