package com.listenzhangbin.twosum;

/**
 * Created by zhangbin on 16/12/4.
 */
public class TwoSum {

    public int[] soltion(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (temp + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}
