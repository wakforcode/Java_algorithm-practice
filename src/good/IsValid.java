package good;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author wzk
 * @description
 * @Date 2022/8/24 18:06
 */
public class IsValid {

    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
     *
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     *
     */

    /**
     * 示例 1：
     * <p>
     * 输入：s = "()"
     * 输出：true
     * 示例2：
     * <p>
     * 输入：s = "()[]{}"
     * 输出：true
     * 示例3：
     * <p>
     * 输入：s = "(]"
     * 输出：false：
     * <p>
     * 输入：s = "([)]"
     * 输出：false
     * 示例5：
     * <p>
     * 输入：s = "{[]}"
     * 输出：true
     *
     * @param s
     * @return
     */

    Map<Character, Character> symbolValues = new HashMap<Character, Character>() {{
        put('(', ')');
        put('[', ']');
        put('{', '}');
    }};

    public boolean isValid(String s) {
        if (s.length() == 0 || s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (symbolValues.get(stack.peek()) == c) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        IsValid isValid = new IsValid();
        isValid.isValid("()");
    }


}
