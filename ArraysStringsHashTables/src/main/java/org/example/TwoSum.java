package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Example 1:
 * Input: nums = [9,2,5,6], target = 7.
 * Output: [1,2]
 * Explain: nums[1] + nums[2] == 7, return [1,2].
 *
 * Example 2:
 * Input: nums = [9,2,5,6], target = 100.
 * Output: null
 *
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) return null;

        Map<Integer, Integer> compMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (compMap.containsKey(nums[i])) return new int[] {i, compMap.get(nums[i])};
            int complement = target - nums[i];
            compMap.put(complement, i);
        }
        return null;
    }
}
