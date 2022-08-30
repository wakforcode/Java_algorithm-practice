package good;

/**
 * @author wzk
 * @description
 * @Date 2022/8/26 17:05
 */
public class SearchInsert {

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * 请必须使用时间复杂度为 O(log n) 的算法。
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [1,3,5,6,8], target = 7
     * 输出: 4
     * 示例2:
     * <p>
     * 输入: nums = [1,3,5,6], target = 2
     * 输出: 1
     * 示例 3:
     * <p>
     * 输入: nums = [1,3,5,7], target = 6
     * 输出: 3
     *
     * @param nums
     * @param target
     * @return
     */

    public int searchInsert(int[] nums, int target) {

        if (nums.length == 0) {
            return 0;
        }

        int left = 0;
        int right = nums.length - 1;

        for (int i = left; i <= right; i++) {
            if (nums[left] < target && nums[right] > target ) {
                if(!(left + 1 == right)){
                    left = left + 1;
                    right = right - 1;
                }else {
                    return left+1;
                }
            } else {
                if (nums[left] > target) {
                    return left;
                }
                if(nums[left] == target){
                    return left;
                }
                if(nums[right] == target){
                    return right;
                }
                if (nums[right] < target) {
                    return right + 1;
                }else {
                    return right;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        SearchInsert searchInsert = new SearchInsert();

        int[] ints = {1, 3, 5, 6};

        int i = searchInsert.searchInsert(ints, 2);
        System.out.println(i);

    }
}
