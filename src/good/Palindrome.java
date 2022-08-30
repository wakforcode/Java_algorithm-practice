package good;

/**
 * @author wzk
 * @description
 * @Date 2022/8/24 14:41
 */
public class Palindrome {

    /**
     * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
     * <p>
     * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     * <p>
     * 例如，121 是回文，而 123 不是。
     */
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s = Integer.toString(x);
        int[] arr = new int[s.length()];
        int a = x;
        int b = 0;
        int i = 0;
        do {
            b = a % 10;
            arr[i] = b;
            a = a / 10;
            i++;
        } while (a != 0);


        int index = arr.length - 1;
        for (int j = 0; j < arr.length; j++) {

            if (j > index / 2) {
                break;
            }
            if (arr[j] != arr[index - j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121121));
    }


}
