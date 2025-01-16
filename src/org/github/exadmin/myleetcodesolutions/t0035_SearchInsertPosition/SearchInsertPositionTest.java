package org.github.exadmin.myleetcodesolutions.t0035_SearchInsertPosition;

import org.github.exadmin.myleetcodesolutions.api.AbstractTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInsertPositionTest extends AbstractTest {

    private void doTestLogic(final int[] nums, final int target, final int expResult) {
        Solution solution = new Solution();
        final int actResult = solution.searchInsert(nums, target);

        assertEquals(expResult, actResult);
    }

    @Test
    public void example1() {
        final int[] nums = new int[] {1, 3, 5, 6};
        final int target = 5;
        final int expResult = 2;

        doTestLogic(nums, target, expResult);
    }

    @Test
    public void example2() {
        final int[] nums = new int[] {1, 3, 5, 6};
        final int target = 2;
        final int expResult = 1;

        doTestLogic(nums, target, expResult);
    }

    @Test
    public void example3() {
        final int[] nums = new int[] {1, 3, 5, 6};
        final int target = 7;
        final int expResult = 4;

        doTestLogic(nums, target, expResult);
    }

    @Test
    public void emptyArrayPositiveTarget() {
        final int[] nums = new int[] {};
        final int target = 7;
        final int expResult = 0;

        doTestLogic(nums, target, expResult);
    }

    @Test
    public void emptyArrayNegativeTarget() {
        final int[] nums = new int[] {};
        final int target = -7;
        final int expResult = 0;

        doTestLogic(nums, target, expResult);
    }

    @Test
    public void bigNumbersInRightPart() {
        final int[] nums = new int[] {2, 10, 12, 16, 18, 100};
        final int target = 5;
        final int expResult = 1;

        doTestLogic(nums, target, expResult);
    }

    @Test
    public void failedTest1() {
        final int[] nums = new int[] {1, 3};
        final int target = 3;
        final int expResult = 1;

        doTestLogic(nums, target, expResult);
    }

    @Test
    public void failedTest2() {
        final int[] nums = new int[] {3,5,7,9,10};
        final int target = 8;
        final int expResult = 3;

        doTestLogic(nums, target, expResult);
    }




}
