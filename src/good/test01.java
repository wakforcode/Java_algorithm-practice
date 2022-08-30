package good;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

/**
 * @author wzk
1 * @ClassName good.test01.java
 * @Description TODO
 * @createTime 2021年09月24日 21:19:00
 */
public class test01 {

    public static void main(String[] args) {
        System.out.print("请输入第一个边：");
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();


        System.out.print("请输入第二个边：");
        Scanner s2 = new Scanner(System.in);
        int b = s2.nextInt();


        System.out.print("请输入第三个边：");
        Scanner s3 = new Scanner(System.in);
        int c = s3.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            // 判断三角形为直角三角形
            if(a*a == b*b +c*c||b*b == a*a +c*c||c*c == b*b +a*a){
                if(a==b||a==c||b==c){
                    System.out.println("您输入的是等腰直角三角形");
                } else {
                    System.out.println("您输入的是一般直角三角形");
                }
            } else {
                if (a*a>b*b+c*c||b*b>a*a+c*c||c*c>a*a+b*b){
                    if(a==b||a==c||b==c){
                        System.out.println("您输入的是等腰钝角三角形");
                    }
                    else{
                        System.out.println("您输入的是一般钝角三角形");
                    }
                }else {
                    if(a==b||a==c||b==c){
                        if(a==b&&a==c&&b==c){
                            System.out.println("您输入的是等边三角形");
                        }else {
                            System.out.println("您输入的是等腰锐角三角形");
                        }
                    }else{
                        System.out.println("您输入的是一般锐角三角形");
                    }
                }
            }
        } else {
            System.out.println("你输入的不是三角形");

        }

    }
}
