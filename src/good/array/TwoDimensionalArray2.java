package good.array;

/**
 * @author wzk
 * @ClassName good.array.TwoDimensionalArray2.java
 * @Description 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。
 * 如果 word 存在于网格中，返回 true ；否则，返回 false 。
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，
 * 其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。
 * 同一个单元格内的字母不允许被重复使用。
 * @createTime 2021年12月22日 16:08:00
 */
public class TwoDimensionalArray2 {


    public boolean exist(char[][] board, String word) {

        if (board.length == 0) {
            return false;
        }
        if(word.length()==0){
            return false;
        }
        char[] chars = word.toCharArray();

        // 确定索引相邻
        /**
         * 01 ->02,11
         */















        for (int i = 0; i < board.length - 1; i++) {

            if (board[i].length > 0) {
                // 横向
                for (int j = 0; j < board[i].length - 1; j++) {



                }
            }


        }


        return false;
    }

}
