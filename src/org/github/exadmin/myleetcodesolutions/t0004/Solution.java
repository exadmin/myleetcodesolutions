package org.github.exadmin.myleetcodesolutions.t0004;

class Solution {
    private final static int UNDEFINED = Integer.MIN_VALUE;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) return 0.0d;

        final int totalLength = (int) doMerge(nums1, nums2, UNDEFINED, false);
        boolean isEven = totalLength % 2 == 0;

        int stopIndex = totalLength / 2 - (isEven ? 1 : 0);

        return doMerge(nums1, nums2, stopIndex, isEven);
    }

    private double doMerge(int[] nums1, int[] nums2, int stopOnIndex, boolean useTwo) {
        // step1: define length of the result merged array to understand middle index
        // step2: navigate to the middle index - to calculate median value

        int totalLength = 0;
        int lastNum = UNDEFINED;
        int index1 = 0;
        int index2 = 0;
        while (true) {
            int num1 = index1 < nums1.length ? nums1[index1] : UNDEFINED;
            int num2 = index2 < nums2.length ? nums2[index2] : UNDEFINED;

            if (num1 == UNDEFINED && num2 == UNDEFINED) {
                break; // stop if nothing to proceed
            }

            // if number from array1 still same as we have
            if (num1 != UNDEFINED && num1 == lastNum) {
                index1++;
                continue;
            }

            // if number from array2 still same as we have
            if (num2 != UNDEFINED && num2 == lastNum) {
                index2++;
                continue;
            }

            // we have another number from input arrays - let's select at least one
            if (num1 != UNDEFINED && (num2 == UNDEFINED || num1 <= num2)) {
                lastNum = num1;
                index1++;
            } else {
                // process second number here
                lastNum = num2;
                index2++;
            }

            if (stopOnIndex != UNDEFINED && totalLength == stopOnIndex) {
                if (!useTwo) return lastNum;

                // define next number which differs to current one
                while (true) {
                    int next1 = index1 < nums1.length ? nums1[index1] : Integer.MAX_VALUE;
                    int next2 = index2 < nums2.length ? nums2[index2] : Integer.MAX_VALUE;

                    int min = UNDEFINED;
                    if (next1 <= next2) {
                        min = next1;
                        index1++;
                    } else {
                        min = next2;
                        index2++;
                    }

                    if (min > lastNum) return (min + lastNum) / 2.0d;
                }
            }

            totalLength++;
        }

        return totalLength;
    }
}