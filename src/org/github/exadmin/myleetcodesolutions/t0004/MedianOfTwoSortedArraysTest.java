package org.github.exadmin.myleetcodesolutions.t0004;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// not ready
@Deprecated
public class MedianOfTwoSortedArraysTest {

    private static void runTest(int[] nums1, int[] nums2, double expValue) {
        double actValue = new Solution().findMedianSortedArrays(nums1, nums2);
        assertEquals(expValue, actValue, 0.01);
    }

    @Test
    public void example1() {
        int[] nums1 = new int[] {1, 3};
        int[] nums2 = new int[] {2};
        double expValue = 2.0d;

        runTest(nums1, nums2, expValue);
    }

    @Test
    public void example2() {
        int[] nums1 = new int[] {1, 2};
        int[] nums2 = new int[] {3, 4};
        double expValue = 2.5d;

        runTest(nums1, nums2, expValue);
    }

    @Test
    public void myTest1() {
        int[] nums1 = new int[] {};
        int[] nums2 = new int[] {};

        runTest(nums1, nums2, 0.0d);
    }

    @Test
    public void myTest2() {
        int[] nums1 = new int[] {1};
        int[] nums2 = new int[] {};

        runTest(nums1, nums2, 1.0d);
    }

    @Test
    public void myTest3() {
        int[] nums1 = new int[] {};
        int[] nums2 = new int[] {1};

        runTest(nums1, nums2, 1.0d);
    }

    @Test
    public void myTest4() {
        int[] nums1 = new int[] {1};
        int[] nums2 = new int[] {1};

        runTest(nums1, nums2, 1.0d);
    }

    @Test
    public void myTest5() {
        int[] nums1 = new int[] {1, 2, 3, 4, 5};
        int[] nums2 = new int[] {2, 3, 4};

        runTest(nums1, nums2, 3.0d);
    }

    @Test
    public void myTest6() {
        int[] nums1 = new int[] {1, 2, 3};
        int[] nums2 = new int[] {4, 5, 6, 7, 8};

        runTest(nums1, nums2, 4.5d);
    }

    @Test
    public void fail1() {
        int[] nums1 = new int[] {2, 2, 4, 4};
        int[] nums2 = new int[] {2, 2, 4, 4};

        runTest(nums1, nums2, 3.0d);
    }

    @Test
    public void fail2() {
        int[] nums1 = new int[] {2, 2, 4, 4};
        int[] nums2 = new int[] {2, 2, 2, 4, 4};

        runTest(nums1, nums2, 2.0d);
    }

    @Test
    public void myTest7() {
        int[] nums1 = new int[] {2, 2, 2, 2, 2, 4, 4, 4, 4};
        int[] nums2 = new int[] {};

        runTest(nums1, nums2, 2.0d);
    }
}
