package LeetcodeQuestions;

import java.util.Arrays;

public class KthLargestElemArr {
    // https://leetcode.com/problems/kth-largest-element-in-an-array/description/

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}