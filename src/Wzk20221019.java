/**
 * @author wzk
 * @description
 * @Date 2022/9/21 17:45
 */
public class Wzk20221019 {

    /**
     * 给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的 中位数 。
     * <p>
     * 算法的时间复杂度应该为 O(log (m+n)) 。
     * <p>
     * 示例 1：
     * 输入：nums1 = [1,3], nums2 = [2]
     * 输出：2.00000
     * 解释：合并数组 = [1,2,3] ，中位数 2
     * <p>
     * 示例 2：
     * 输入：nums1 = [1,2], nums2 = [3,4]
     * 输出：2.50000
     * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
     * <p>
     * 提示：
     * <p>
     * nums1.length == m
     * nums2.length == n
     * 0 <= m <= 1000
     * 0 <= n <= 1000
     * 1 <= m + n <= 2000
     * -106 <= nums1[i], nums2[i] <= 106
     *
     * @param nums1
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        }

        int[] nums = new int[nums1.length + nums2.length];
        int p = 0;
        int q = 0;

        for (int i = 0; i <= nums1.length + nums2.length - 1; i++) {
            if (q >= nums2.length || (p < nums1.length && nums1[p] < nums2[q])) {
                nums[i] = nums1[p];
                p++;
            } else {
                nums[i] = nums2[q];
                q++;
            }
        }
        if (nums.length % 2 == 0) {
            return (double) (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2;
        } else {
            return (double) nums[nums.length / 2];
        }
    }


    /**
     * 给你一个会议时间安排的数组 intervals ，每个会议时间都会包括开始和结束的时间 intervals[i] = [starti, endi] ，返回 所需会议室的最小数量 。
     * <p>
     * 示例 1：
     * 输入：intervals = [[2,30],[5,10],[15,20],[16,18],[0,40],[3,8]]
     * 输出：5 ------------  0,2,3,5,8,10,15,16,20,18,30,40
     * <p>
     * 示例 2：
     * 输入：intervals = [[7,10],[2,4]]
     * 输出：1
     * <p>
     * 提示：
     * 1 <=intervals.length <= 104
     * 0 <= starti < endi <= 106
     *
     * @param intervals
     */
    public int minMeetingRooms(int[][] intervals) {

        int num = intervals.length;


        return num;
    }







    public static void main(String[] args) {

        Wzk20221019 wzk = new Wzk20221019();

//        int reverse = wzk.reverse(-123);

//        double medianSortedArrays = wzk.findMedianSortedArrays(new int[]{0}, new int[]{});
        int i = wzk.minMeetingRooms(new int[][]{{9, 14}, {5, 6}, {3, 5}, {12, 19}});
        System.out.println(i);
//        System.out.println(abccba);
    }

}
