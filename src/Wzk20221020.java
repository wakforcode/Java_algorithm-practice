import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wzk
 * @description
 * @Date 2022/10/19 16:18
 */
public class Wzk20221020 {


    /**
     * 给定一个字符串s，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
     * <p>
     * 示例 1：
     * 输入：s = "Let's take LeetCode contest"
     * 输出："s'teL ekat edoCteeL tsetnoc"
     * <p>
     * 示例 2:
     * 输入： s = "God Ding"
     * 输出："doG gniD"
     * <p>
     * <p>
     * 提示：
     * 1 <= s.length <= 5 * 104
     * s包含可打印的 ASCII 字符。
     * s不包含任何开头或结尾空格。
     * s里 至少 有一个词。
     * s中的所有单词都用一个空格隔开。
     */
    public String reverseWords(String s) {

        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            String s1 = split[i];
            char[] chars = s1.toCharArray();

            char[] temp = new char[s1.length()];
            for (int j = chars.length - 1; j >= 0; j--) {
                temp[chars.length - 1 - j] = chars[j];
            }
            split[i] = String.valueOf(temp);
        }
        return String.join(" ", split);
    }


    /**
     * 给定一个经过编码的字符串，返回它解码后的字符串。
     * <p>
     * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
     * <p>
     * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
     * <p>
     * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像3a或2[4]的输入。
     * <p>
     * 示例 1：
     * 输入：s = "3[a]2[bc]"
     * 输出："aaabcbc"
     * <p>
     * 示例 2：
     * 输入：s = "3[a2[c]]"
     * 输出："accaccacc"
     * <p>
     * 示例 3：
     * 输入：s = "2[abc]3[cd]ef"
     * 输出："abcabccdcdcdef"
     * <p>
     * 示例 4：
     * 输入：s = "abc3[cd]xyz"
     * 输出："abccdcdcdxyz"
     * <p>
     * <p>
     * 提示：
     * <p>
     * 1 <= s.length <= 30
     * s由小写英文字母、数字和方括号'[]' 组成
     * s保证是一个有效的输入。
     * s中所有整数的取值范围为[1, 300]
     *
     * @param s
     */

    public String decodeString(String s) {

        return null;

    }


    public static void main(String[] args) {
        Wzk20221020 wzk = new Wzk20221020();
//        String s = wzk.reverseWords("Let's take LeetCode contest");
//        System.out.println(s);
        List<List<Integer>> generate = wzk.generate(4);
        System.out.println();


    }


    /**
     * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
     * <p>
     * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
     * <p>
     * 示例 1:
     * 输入: numRows = 5
     * 1   2       3       4           5             6
     * 输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,5,4,1],[1,5,10,10,5,1]]
     * <p>
     * 示例2:
     * 输入: numRows = 1
     * 输出: [[1]]
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> all = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> aaa = getListPart(i);
            all.add(aaa);
        }
        return all;
    }

    /**
     * 1   2      3        4          5              6
     * 输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1],[1,5,10,10,5,1]]
     *
     * @param i
     * @return
     */
    private List<Integer> getListPart(int i) {
        List<Integer> ints = new ArrayList<>();

        if (i == 1) {
            return Arrays.asList(1);
        }
        if (i == 2) {
            return Arrays.asList(1, 1);
        }
        List<Integer> listPart = getListPart(i - 1);

        for (int a = 0; a < i; a++) {
            if (a == 0 || a == i - 1) {
                ints.add(1);
            } else {
                ints.add(listPart.get(a - 1) + listPart.get(a));
            }
        }
        return ints;
    }


//    public int minMeetingRooms(int[][] intervals) {
//        int[] startTime = new int[intervals.length];
//        int[] endTime = new int[intervals.length];
//
//        for (int i = 0; i < intervals.length; i++) {
//            startTime[i] = intervals[i][0];
//            endTime[i] = intervals[i][1];
//            boolean isNeedNewMeetingRooms = true;
//            for (int j = 0; j < i; j++) {
//                if(){
//
//                }
//
//            }
//
//        }
//        return num;
//
//    }
}
