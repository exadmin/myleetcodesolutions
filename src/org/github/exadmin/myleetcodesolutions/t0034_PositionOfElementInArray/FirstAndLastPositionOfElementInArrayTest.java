package org.github.exadmin.myleetcodesolutions.t0034_PositionOfElementInArray;

import org.github.exadmin.myleetcodesolutions.api.AbstractTest;
import org.junit.Test;

public class FirstAndLastPositionOfElementInArrayTest extends AbstractTest {

    private void doTestLogic(final int[] nums, final int target, final int[] expResult) {
        Solution solution = new Solution();
        int[] actResult = solution.searchRange(nums, target);

        assertArraysEquals(expResult, actResult);
    }

    @Test
    public void example1() {
        final int[] nums = new int[] {5, 7, 7, 8, 8, 10};
        final int[] expResult = new int[] {3, 4};
        final int target = 8;

        doTestLogic(nums, target, expResult);
    }

    @Test
    public void example2() {
        final int[] nums = new int[] {5, 7, 7, 8, 8, 10};
        final int[] expResult = new int[] {-1, -1};
        final int target = 6;

        doTestLogic(nums, target, expResult);
    }

    @Test
    public void example3() {
        final int[] nums = new int[] {};
        final int[] expResult = new int[] {-1, -1};
        final int target = 0;

        doTestLogic(nums, target, expResult);
    }

    @Test
    public void lastElement() {
        final int[] nums = new int[] {5, 7, 7, 8, 8, 10};
        final int[] expResult = new int[] {5, 5};
        final int target = 10;

        doTestLogic(nums, target, expResult);
    }

    @Test
    public void firstElement() {
        final int[] nums = new int[] {5, 7, 7, 8, 8, 10};
        final int[] expResult = new int[] {0, 0};
        final int target = 5;

        doTestLogic(nums, target, expResult);
    }

    @Test
    public void bigDeltaBetweenNumbers() {
        final int[] nums = new int[] {500, 700, 700, 800, 8000, 10000};
        final int[] expResult = new int[] {1, 2};
        final int target = 700;

        doTestLogic(nums, target, expResult);
    }

    @Test
    public void allNumbersAreSameEvenSize() {
        final int[] nums = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        final int[] expResult = new int[] {0, 10};
        final int target = 1;

        doTestLogic(nums, target, expResult);
    }

    @Test
    public void allNumbersAreSameOddSize() {
        final int[] nums = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        final int[] expResult = new int[] {0, 11};
        final int target = 1;

        doTestLogic(nums, target, expResult);
    }

    @Test
    public void absentNumber() {
        final int[] nums = new int[] {1, 1, 1, 3, 3, 3};
        final int[] expResult = new int[] {-1, -1};
        final int target = 2;

        doTestLogic(nums, target, expResult);
    }

    @Test
    public void failed1() {
        final int[] nums = new int[] {1};
        final int[] expResult = new int[] {0, 0};
        final int target = 1;

        doTestLogic(nums, target, expResult);
    }
}
