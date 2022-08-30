package good;

/**
 * @author wzk
 * @description
 * @Date 2022/8/29 11:33
 */
public class ClimbStairs {

    /**
     * 假设你正在爬楼梯。需要 n阶你才能到达楼顶。
     *
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     *
     *
     * 示例 1：
     * 输入：n = 2
     * 输出：2
     * 解释：有两种方法可以爬到楼顶。
     * 1. 1 阶 + 1 阶
     * 2. 2 阶
     *
     * 示例 2：
     * 输入：n = 3
     * 输出：3
     * 解释：有三种方法可以爬到楼顶。
     * 1. 1 阶 + 1 阶 + 1 阶
     * 2. 1 阶 + 2 阶
     * 3. 2 阶 + 1 阶
     *
     * 示例 3：
     * 输入：n = 4
     * 输出：5
     * 解释：有三种方法可以爬到楼顶。
     * 1. 1 阶 + 1 阶 + 1 阶+ 1 阶
     * 2. 1 阶 + 2 阶+ 1 阶
     * 3. 1 阶 + 1 阶+ 2 阶
     * 3. 2 阶 + 1 阶+ 1 阶
     * 4. 2 阶 + 2 阶
     * 提示：
     *
     * 1 <= n <= 45
     */

    /**
     * 斐波那锲数列
     * 1,1,2,3,5,8,13,21,34,55
     * @param n
     * @return
     */
    public int climbStairs(int n) {



        int q=0;
        int p=0;
        int r=1;

        int index = 1;
        while (index<=n){
            q=p;
            p=r;
            r = q+p;
            index++;
        }
        return r;

    }

    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();
        System.out.println(climbStairs.climbStairs(5));
    }

}
