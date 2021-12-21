import java.util.ArrayList;
import java.util.List;

/**
 * @author wzk
 * @ClassName TwoDimensionalArray.java
 * @Description 二维数组的查找
 * @createTime 2021年12月21日 17:07:00
 */
public class TwoDimensionalArray {

    public static void main(String[] args) {
        int[][] ma = new int[][]{{-5}};
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        boolean numberIn2DArray = twoDimensionalArray.findNumberIn2DArray(ma, -5);
        System.out.println(numberIn2DArray);

    }
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int[] firstMatrix = matrix[0];
        int[] lastMatrix = matrix[matrix.length - 1];
        if (firstMatrix.length == 0 || lastMatrix.length == 0) {
            return false;
        }
        //该数在范围内
        if (firstMatrix[0] <= target && lastMatrix[lastMatrix.length - 1] >= target) {

            // 所有可能出现的行
            List<Integer> indexRowList = new ArrayList<>();
            List<Integer> indexColumnList = new ArrayList<>();
            for (int i = 0; i <= matrix.length - 1; i++) {
                if (matrix[i][0] <= target && matrix[i][matrix[i].length - 1] >= target) {
                    indexRowList.add(i);
                }
            }
            if (indexRowList.size() == 0) {
                return false;
            }
            int firstArrIndex = indexRowList.get(0);
            int lastArrIndex = indexRowList.get(indexRowList.size() - 1);
            // 查找所有可能出现的列
            for (int k = 0; k <= matrix[firstArrIndex].length - 1; k++) {
                if (matrix[firstArrIndex][k] <= target && matrix[lastArrIndex][k] >= target) {
                    indexColumnList.add(k);
                }
            }
            if (indexColumnList.size() == 0) {
                return false;
            }
            // 对可能的行和列进行暴力解法
            for (int m : indexRowList) {
                for (int t : indexColumnList) {
                    if (matrix[m][t] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
