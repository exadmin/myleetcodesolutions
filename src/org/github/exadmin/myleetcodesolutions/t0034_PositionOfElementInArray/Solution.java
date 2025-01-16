package org.github.exadmin.myleetcodesolutions.t0034_PositionOfElementInArray;

/**
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 *
 * If target is not found in the array, return [-1, -1].
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Constraints:
 *
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums is a non-decreasing array.
 * -109 <= target <= 109
 *
 * STATUS = DONE
 * RESULT = 0 ms / beats 100%
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fromIndex = 0;
        int toIndex = nums.length - 1;

        boolean isFound = false;

        // exceptional state - when toIndex == fromIndex
        if (nums.length == 1) {
            return nums[0] == target ? new int[] {0, 0} : new int[] {-1, -1};
        }

        while (toIndex > fromIndex) {
            isFound = nums[fromIndex] == target || nums[toIndex] == target;
            if (isFound) break;

            int middleIndex = fromIndex + (toIndex - fromIndex) / 2;
            if (nums[middleIndex] == target) {
                toIndex = middleIndex;
                isFound = true;
                break;
            }

            if (nums[middleIndex] > target) {
                toIndex = middleIndex - 1;
            } else {
                fromIndex = middleIndex + 1;
            }
        }

        if (!isFound) return new int[] {-1, -1};

        // go left while same number
        int curIndex = nums[fromIndex] == target ? fromIndex : toIndex;
        while (curIndex >= 0 && nums[curIndex] == target) curIndex--;

        curIndex++;
        fromIndex = curIndex;

        while (curIndex < nums.length && nums[curIndex] == target) curIndex++;
        toIndex = curIndex - 1;

        return new int[] {fromIndex, toIndex};
    }
}