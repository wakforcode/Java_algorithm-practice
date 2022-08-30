package good.string;

/**
 * @author wzk
 * @ClassName good.string.ReplaceSpace.java
 * @Description 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * @createTime 2021年12月22日 11:30:00
 */
public class ReplaceSpace {
    public static void main(String[] args) {
        ReplaceSpace replaceSpace = new ReplaceSpace();
        String s = replaceSpace.replaceSpace("      ");
        System.out.println(s);

    }


    public String replaceSpace(String s) {

        if (s.length() == 0) {
            return s;
        }
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        String space = " ";
        char c1 = space.charAt(0);
        for (char c : chars) {
            if (c == c1) {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
