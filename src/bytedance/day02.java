package bytedance;

import good.LengthOfLastWord;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wzk
 * @description
 * @Date 2023/1/6 12:20
 */
public class day02 {
    /**
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
     * <p>
     * 示例 1:
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * 示例 2:
     * 输入: s = "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * 示例 3:
     * 输入: s = "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     */
    public static int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        int maxLength = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i <= s.length() - 1; i++) {
            if (characterIntegerMap.get(chars[i]) != null) {
                i = characterIntegerMap.get(chars[i]);
                if (s.length() - 1 - i <= maxLength) {
                    return maxLength;
                }
                characterIntegerMap.clear();
            } else {
                characterIntegerMap.put(chars[i], i);
            }
            if (maxLength < characterIntegerMap.size()) {
                maxLength = characterIntegerMap.size();
            }
        }
        return maxLength;
    }


    /**
     * 请你设计并实现一个满足  LRU (最近最少使用) 缓存 约束的数据结构。
     * 实现 LRUCache 类：
     * LRUCache(int capacity) 以 正整数 作为容量 capacity 初始化 LRU 缓存
     * int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
     * void put(int key, int value) 如果关键字 key 已经存在，则变更其数据值 value ；如果不存在，则向缓存中插入该组 key-value 。如果插入操作导致关键字数量超过 capacity ，则应该 逐出 最久未使用的关键字。
     * 函数 get 和 put 必须以 O(1) 的平均时间复杂度运行。
     *
     *
     *
     * 示例：
     *
     * 输入
     * ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
     * [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
     * 输出
     * [null, null, null, 1, null, -1, null, -1, 3, 4]
     *
     * 解释
     * LRUCache lRUCache = new LRUCache(2);
     * lRUCache.put(1, 1); // 缓存是 {1=1}
     * lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
     * lRUCache.get(1);    // 返回 1
     * lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
     * lRUCache.get(2);    // 返回 -1 (未找到)
     * lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
     * lRUCache.get(1);    // 返回 -1 (未找到)
     * lRUCache.get(3);    // 返回 3
     * lRUCache.get(4);    // 返回 4
     * @param args
     */

    class LRUCache {
//        public LRUCache(int capacity) {
//
//
//
//        }
//
//        public int get(int key) {
//
//        }
//
//        public void put(int key, int value) {
//
//        }
    };

    /**
     * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
     * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
     * 你必须设计并实现时间复杂度为 O(n) 的算法解决此问题。
     *
     * 示例 1:
     * 输入: [3,2,1,5,6,4], k = 2
     * 输出: 5
     * 示例 2:
     * 输入: [3,2,3,1,2,4,5,5,6], k = 4
     * 输出: 4
     * @param args
     */
//    public int findKthLargest(int[] nums, int k) {
//
//
////        for(){
////
////        }
//
//
//
//    }

    public static void main(String[] args) {
        String s = " ";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

}
