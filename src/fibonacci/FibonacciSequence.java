package fibonacci;

/**
 * @author wzk
 * @ClassName fibonacci.FibonacciSequence.java
 * @Description 斐波那切数列
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * @createTime 2021年12月21日 16:25:00
 */
public class FibonacciSequence {
    /**
     * 输入n  输出第n个斐波那契数列数字是多少
     * 2,3,5,8,13,21,34,55,89
     *
     * @param n
     * @return
     */
    public int fib(int n) {

//        // 递归耗时太久
//        final int MOD = 1000000007;
//
//        if (n == 0) {
//            return 0;
//        }
//        if (n <= 2) {
//            return 1;
//        } else {
//            int returnNum = 0;
//            for (int i = 1; i < n; i++) {
//                returnNum = fib(n - 1) + fib(n - 2);
//            }
//            return returnNum;
//        }

        // 动态规划
        final int MOD = 1000000007;
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        } else {
            int q = 1;
            int p = 0;
            int returnNum = 1;
            for (int i = 2; i < n; i++) {
                p=q;
                q=returnNum;
                returnNum = (q+p)%MOD;
            }
            return returnNum;
        }
    }

    public static void main(String[] args) {
            FibonacciSequence fibonacciSequence = new FibonacciSequence();
            System.out.println(fibonacciSequence.fib(3));



    }

}
