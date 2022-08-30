package good;

/**
 * @author wzk
 * @description
 * @Date 2022/8/25 14:32
 */
public class RemoveElement {

    // TODO: 2022/8/25 好好想想 没做完 ！

    /**
     * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     * <p>
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     * <p>
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums = [3,2,2,3], val = 3
     * 输出：2, nums = [2,2]
     * 解释：函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。你不需要考虑数组中超出新长度后面的元素。例如，函数返回的新长度为 2 ，而 nums = [2,2,3,3] 或 nums = [2,2,0,0]，也会被视作正确答案。
     * 示例 2：
     * <p>
     * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
     * 输出：5, nums = [0,1,4,0,3]
     * 解释：函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。注意这五个元素可为任意顺序。你不需要考虑数组中超出新长度后面的元素。
     * <p>
     * [0,1,4,0,3,2,2,2]
     * <p>
     * [0,1,4,0,3]
     *
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {

        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        if (left == right) {

            if (nums[left] == val) {
                return 0;
            } else {
                return 1;
            }
        }
        while (left != right) {
            if (nums[left] == val && nums[right] != val) {
                nums[left] = nums[right];
                nums[right] = val;
            } else {
                if (nums[left] != val) {
                    left++;
                } else {
                    if (nums[right] == val) {
                        right--;
                    }
                }
            }
        }
        if (nums[left] != val) {
            return left + 1;
        } else {
            return left;
        }
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();

        int[] ints = {4,2,0,2,2,1,4,4,1,4,3,2};
        int i = removeElement.removeElement(ints, 4);

        for (int j = 0; j < i; j++) {

            System.out.println(ints[j]);
        }

    }
}
