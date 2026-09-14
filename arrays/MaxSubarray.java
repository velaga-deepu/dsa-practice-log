// Problem: Maximum Subarray
// Given an array of integers, find the contiguous subarray with the
// largest sum, and return that sum.
// Approach: Kadane's Algorithm — walk through the array once, keeping
// a running sum. If the running sum drops below the current number,
// it's better to start fresh from here rather than carry negative baggage.
// Track the best sum seen so far.
// Time complexity: O(n) | Space complexity: O(1)

public class MaxSubarray {
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int bestSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            bestSum = Math.max(bestSum, currentSum);
        }

        return bestSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + result);
    }
}