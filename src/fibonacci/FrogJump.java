package fibonacci;

/**
 * @author wzk
 * @ClassName fibonacci.FrogJump.java
 * @Description 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * @createTime 2021年12月21日 19:05:00
 */
public class FrogJump {

    public static void main(String[] args) {
        FrogJump frogJump = new FrogJump();
        int i = frogJump.numWays(5);
        System.out.println(i);
    }

    public int numWays(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        /**
         * 1 2 3 4 5 6 7
         * 1 2 3 5 8
         * 斐波那切数列
         * 解法：递归
         *      动态规划
         */
        int q = 0;
        int p = 1;
        int numWay = 2;
        for (int i = 2; i < n; i++) {
            q = p;
            p = numWay;
            numWay = (q + p)% 1000000007;;
        }
        return numWay;

    }


}


