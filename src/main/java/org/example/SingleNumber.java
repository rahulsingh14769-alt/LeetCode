package org.example;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int singleOccurence = nums[0];
        for (int i = 1; i < nums.length; i++) {
            singleOccurence = singleOccurence ^ nums[i];
        }
        return singleOccurence;
    }
}
