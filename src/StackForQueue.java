import java.util.Deque;
import java.util.LinkedList;

/**
 * @author wzk
 * @ClassName SwordForOffer.java
 * @Description 用两个栈实现一个队列
 * @createTime 2021年12月21日 15:56:00
 */
public class StackForQueue {

    class CQueue {

        Deque<Integer> stack1;
        Deque<Integer> stack2;

        public CQueue() {
            stack1 = new LinkedList<Integer>();
            stack2 = new LinkedList<Integer>();
        }

        public void appendTail(int value) {

            stack1.push(value);
        }

        public int deleteHead() {
            if (!stack2.isEmpty()) {
                return stack2.pop();
            } else {
                // 只做出栈操作的2为空则将1中的元素全都放到2中 然后2依次取出直到为空
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
                return stack2.isEmpty() ? -1 : stack2.pop();
            }
        }
    }
}
