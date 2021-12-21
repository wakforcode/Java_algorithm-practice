/**
 * @author wzk
 * @ClassName FrogJump.java
 * @Description 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * @createTime 2021年12月21日 19:05:00
 */
public class FrogJump {

    public int numWays(int n) {

        if (n==0||n==1){
            return 1;
        }else {
            if(n==2){
                return 2;
            }

            /**
             * 因为青蛙每次只能跳1或者2
             * 故将3作为一组
             */
            int a = (n / 2)*2;
            if(n % 3==1){
                a = a+1;
            }else if(n%3==2){
                a=a+2;
            }
            return a;

        }


    }

}
