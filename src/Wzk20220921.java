import java.util.ArrayList;
import java.util.List;

/**
 * @author wzk
 * @description
 * @Date 2022/9/21 17:45
 */
public class Wzk20220921 {

    /**
     * 给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的 中位数 。
     *
     * 算法的时间复杂度应该为 O(log (m+n)) 。
     *
     * 示例 1：
     * 输入：nums1 = [1,3,6，7，8], nums2 = [4，5]
     * 输出：2.00000
     * 解释：合并数组 = [1,2,3] ，中位数 2
     * 示例 2：
     *
     * 输入：nums1 = [1,2], nums2 = [3,4]
     * 输出：2.50000
     * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
     *
     * @param nums1
     * @param nums2
     * @return
     */

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length1 = nums1.length;
        int length2 = nums2.length;

        int maxLength = Math.max(length1, length2);

        int[] mergeArr = new int[length1+length2];

        int p = 0;
        int q = 0;


        for (int i = 0;i<=length1+length2-1;i++){

            if(p<length1&&q<length2){
                if(nums1[p]<nums2[q]){
                    mergeArr[i] = nums1[p];
                    p++;
                }else {
                    mergeArr[i] = nums2[q];
                    q++;
                }
            }else {
                if(p>=length1&&q<length2){
                    mergeArr[i] = nums2[q];
                    q++;
                }else {
                    mergeArr[i] = nums1[p];
                    p++;
                }
            }
        }


        return 0;

    }






    public static void main(String[] args) {
        Wzk20220921 wzk20220921 = new Wzk20220921();
        int[] nums1 =new int[]{1,3,6,7,8};
        int[] nums2 =new int[]{4,5};

        wzk20220921.findMedianSortedArrays(nums1,nums2);

    }

}
