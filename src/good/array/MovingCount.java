package good.array;

/**
 * @author wzk
 * @ClassName good.array.MovingCount.java
 * @Description TODO
 * @createTime 2021年12月22日 18:02:00
 */
public class MovingCount {
    /**
     * 地上有一个m行n列的方格，
     * 从坐标 [0,0] 到坐标 [m-1,n-1] 。
     * 一个机器人从坐标 [0, 0] 的格子开始移动，
     * 它每次可以向左、右、上、下移动一格（不能移动到方格外），
     * 也不能进入行坐标和列坐标的数位之和大于k的格子。
     * 例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。
     * 但它不能进入方格 [35, 38]，因为3+5+3+8=19。
     * 请问该机器人能够到达多少个格子？
     */

    public int movingCount(int m, int n, int k) {

        // 查找0-m-1 和0-n-1范围内 行坐标和列坐标的数位之和小于于k的格子

        int a = 0;
        int tempM = 0;
        int tempN = 0;

        for (int i = 0; i <= m - 1; i++) {

            if (i < 10) {
                tempM = i;
            } else {
                int shiweiM = i / 10;
                int geweiM = i % 10;
                tempM = shiweiM + geweiM;
            }

            if (i > k && tempM > k) {
                return a;
            }
            if (tempM <= k) {
                for (int j = 0; j <= n - 1; j++) {
                    if (j < 10) {
                        tempN = j;
                    } else {
                        int shiweiN = j / 10;
                        int geweiN = j % 10;
                        tempN = shiweiN + geweiN;
                    }
                    if (j > k && tempN > k) {
                        break;
                    }
                    if (tempM + tempN <= k) {
                        a++;
                    }
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        MovingCount movingCount = new MovingCount();
        int i = movingCount.movingCount(38, 15, 9);
        System.out.println(i);

    }
}
