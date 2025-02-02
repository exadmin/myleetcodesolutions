package org.github.exadmin.myleetcodesolutions.t0007_ReverseInteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTests {

    private void doTestLogic(final int inValue, final int expValue) {
        Solution solution = new Solution();
        int actValue = solution.reverse(inValue);

        assertEquals(expValue, actValue);
    }

    @Test
    public void example01() {
        doTestLogic(123, 321);
    }

    @Test
    public void example02() {
        doTestLogic(-123, -321);
    }

    @Test
    public void example03() {
        doTestLogic(120, 21);
    }

    @Test
    public void myExample01() {
        doTestLogic(12000, 21);
    }

    @Test
    public void myExample02() {
        doTestLogic(-12000, -21);
    }

    @Test
    public void myExample03() {
        doTestLogic(1200021, 1200021);
    }

    @Test
    public void myExample04() {
        doTestLogic(0, 0);
    }

    @Test
    public void myFailedTest01() {
        doTestLogic(1534236469, 0);
    }

    @Test
    public void myFailedTest02() {
        doTestLogic(1463847412, 2147483641);
    }

    @Test
    public void myFailedTest03() {
        doTestLogic(1563847412, 0);
    }
}
