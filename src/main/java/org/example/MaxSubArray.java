package org.example;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int max_so_far = 0;
        int curr_so_far = 0;
        for (int i = 0; i < nums.length; i++) {
            curr_so_far = Math.max(nums[i], curr_so_far + nums[i]);
            max_so_far = Math.max(max_so_far, curr_so_far);
        }
        return max_so_far;
    }
}
