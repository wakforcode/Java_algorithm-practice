package good;

import java.util.Scanner;

/**
 * @author wzk
 * @ClassName good.test02.java
 * @Description TODO
 * @createTime 2021年09月25日 15:17:00
 */
public class test02 {


    public static void main(String[] args) {

        System.out.print("请输入三角形的第一条边：");
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();

        System.out.print("请输入三角形的第二条边：");
        Scanner s2 = new Scanner(System.in);
        int b = s2.nextInt();

        System.out.print("请输入三角形的第三条边：");
        Scanner s3 = new Scanner(System.in);
        int c = s3.nextInt();

        if (a > 0 && b > 0 && c > 0 && !(a + b < c || a + c < b || b + c < a)) {


            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == b * b + a * a) {
                if (a == b || a == c || b == c) {
                    System.out.println("您输入的是一个等腰直角三角形");
                } else {
                    System.out.println("您输入的是一个一般直角三角形");
                }
            } else {
                if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > b * b + a * a) {

                    if (a == b || b == c || a == c) {
                        System.out.println("您输入的是等腰钝角三角形");


                    }else
                        System.out.println("您输入的是一般钝角三角形");


                }else{
                    if(a==b||b==c||a==c){
                        if(a==b&&a==c){
                            System.out.println("您输入的是一个等边三角形");
                        }else{
                            System.out.println("您输入的是一个等腰锐角三角形");

                        }
                    }else{
                        System.out.println("您输入的是一个一般锐角三角形");
                    }
                }
                    }
        } else {
            System.out.println("您输入的不是三角形");
        }
    }
}
