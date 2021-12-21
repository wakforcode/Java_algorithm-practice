import java.util.HashSet;
import java.util.Set;

/**
 * @author wzk
 * @ClassName Solution.java
 * @Description TODO
 * @createTime 2021年08月15日 14:01:00
 */
public class Solution {

    /**
     * 计算并返回 x 的平方根，其中 x 是非负整数。
     * <p>
     * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
     */

    public static int mySqrt(int x) {

        if (x == 0 || x == 1) {
            return x;
        }
        int l = 0;
        int r = x;
        int mid = 0;
        do {
            mid = (l + r) / 2;
            if (mid * mid < x) {
                l = mid;
            } else {
                r = mid;
            }
        } while (l < r);
        return mid;
    }

    /**
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
     *
     * @param s
     */
    public static int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) {
            return 0;
        }

        String[] stringArr = s.split("");

        Set<String> stringSet = new HashSet<>();

        int p = 0;
        int q = 0;

        for (String value : stringArr) {

            if(stringSet.contains(value)){

            }

        }
        return 0;

    }


    public static void main(String[] args) {

//        int i = mySqrt(8);
//        System.out.println(i);

//        int pwwkew = lengthOfLongestSubstring("pwwkew");
//        System.out.println(pwwkew);

        String s = "订单号:12312,转账银行:萨达所大所银行,转账帐号:32423423,转账人姓名:王志凯,转账金额:2342,转账日期:2021.2.2,转账备注:这是备注";
        String[] contentArr = s.split(",");
        for (String value : contentArr) {
            System.out.println(value);
            int i = value.indexOf(":");
            String substring = value.substring(i + 1, value.length());
            System.out.println(substring);
        }


        }
}
