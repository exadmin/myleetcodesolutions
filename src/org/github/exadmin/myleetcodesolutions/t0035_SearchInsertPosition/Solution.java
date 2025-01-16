package org.github.exadmin.myleetcodesolutions.t0035_SearchInsertPosition;

/**
 * Task description:
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 *
 * STATUS = DONE
 */
class Solution {
    public int searchInsert(final int[] nums, final int targetValue) {
        if (nums == null || nums.length == 0) return 0;

        int fromIndex = 0;
        int toIndex   = nums.length - 1;

        // check target value is outside diapasone for existed elements
        if (targetValue < nums[0]) return 0;
        if (targetValue > nums[nums.length - 1]) return nums.length;

        // target index somewhere inside
        while (fromIndex < toIndex) {
            if (nums[fromIndex] == targetValue) return fromIndex;
            if (nums[toIndex] == targetValue) return toIndex;

            int curIndex = fromIndex + (toIndex - fromIndex) / 2;
            int curValue = nums[curIndex];
            if (curValue == targetValue) return curIndex;

            if (targetValue < curValue) {
                toIndex = curIndex - 1;
            } else {
                fromIndex = curIndex + 1;
            }

            // System.out.println("curIndex = " + curIndex + ", curValue = " + curValue);
            // System.out.println("fromIndex = " + fromIndex + ", toIndex = " + toIndex);
        }

        // here we have fromIndex == toIndex
        int curValue = nums[fromIndex];
        if (targetValue > curValue) return fromIndex + 1;

        return fromIndex;
    }
}