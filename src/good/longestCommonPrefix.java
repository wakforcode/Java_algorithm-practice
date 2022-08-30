package good;

/**
 * @author wzk
 * @description
 * @Date 2022/8/24 15:47
 */
public class longestCommonPrefix {

    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * <p>
     * 如果不存在公共前缀，返回空字符串 ""。
     * 示例 1：
     * <p>
     * 输入：strs = ["flower","flow","flight"]
     * 输出："fl"
     * 示例 2：
     * <p>
     * 输入：strs = ["dog","racecar","car"]
     * 输出：""
     * 解释：输入不存在公共前缀。
     */

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }
        String str = strs[0];
        int length = str.length();
        int index = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() <= length) {
                length = strs[i].length();
                index = i;
            }
        }
        String shortStr = strs[index];
        StringBuilder s = new StringBuilder();
        char[] shortChars = shortStr.toCharArray();
        for (int j = 0; j < shortChars.length; j++) {

            for (int i = 0; i < strs.length; i++) {
                String str1 = strs[i];
                char[] chars = str1.toCharArray();
                if (shortChars[j] != chars[j]) {
                    return s.toString();
                }
                if (shortChars[j] == chars[j] && i == strs.length - 1) {
                    s.append( shortChars[j]);
                }
            }
        }
        if (s.length()>0) {
            return s.toString();
        }
        return "";
    }

    public static void main(String[] args) {
        longestCommonPrefix prefix = new longestCommonPrefix();
        String[] strings = new String[]{"cir","car"};
        String s = prefix.longestCommonPrefix(strings);
        System.out.println(s);
    }


}
