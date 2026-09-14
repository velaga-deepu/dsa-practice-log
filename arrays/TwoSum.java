// Problem: Two Sum
// Given an array of integers and a target, return indices of the two
// numbers that add up to the target.
// Approach: Use a HashMap to store numbers seen so far, so we can check
// in O(1) whether the complement (target - current number) already exists.
// Time complexity: O(n) | Space complexity: O(n)

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            seen.put(nums[i], i);
        }
        return new int[] {}; // no solution found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}