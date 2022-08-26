/**
 * @author wzk
 * @description
 * @Date 2022/8/26 16:16
 */
public class StrStr {

    /**
     * 给你两个字符串haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回 -1 。
     * <p>
     * 说明：
     * <p>
     * 当needle是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
     * <p>
     * 对于本题而言，当needle是空字符串时我们应当返回 0 。这与 C 语言的strstr()以及 Java 的indexOf()定义相符。
     * <p>
     * 示例 1：
     * <p>
     * 输入：haystack = "hello", needle = "ll"
     * 输出：2
     * 示例 2：
     * <p>
     * 输入：haystack = "abaabaaaa", needle = "abb"
     * 输出：-1
     *
     * @param haystack
     * @param needle
     * @return
     */

    public int strStr(String haystack, String needle) {

        if (needle == null || needle.length() == 0) {
            return 0;
        }
        if (haystack == null || haystack.length() == 0 || needle.length() > haystack.length()) {
            return -1;
        }
        int left;
        char[] a = haystack.toCharArray();
        char[] b = needle.toCharArray();
        for (int i = 0; i < haystack.length(); i++) {

            if (a[i] != b[0]) {
                continue;
            }
            left = i;
            for (int j = 0; j < needle.length(); j++) {
                if (b[j] != a[left]) {
                    break;
                }
                if (j == needle.length() - 1) {
                    return i;
                }
                left++;
                if (left == haystack.length()) {
                    return -1;
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        StrStr strStr = new StrStr();
        int i = strStr.strStr("mississippi", "issipi");
        System.out.println(i);
    }
}
