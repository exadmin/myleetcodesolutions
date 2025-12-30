package org.github.exadmin.myleetcodesolutions.t0029_DivideTwoIntegers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivideTwoIntegersTest {

    private static final Solution solution = new Solution();

    private int div(int divident, int divisor) {
        return solution.divide(divident, divisor);
    }

    @Test
    public void example1() {
        int divident = 10;
        int divisor  = 3;
        int expRes   = 3;

        int actRes = div(divident, divisor);
        assertEquals(expRes, actRes);
    }

    @Test
    public void example2() {
        int divident = 7;
        int divisor  = -3;
        int expRes   = -2;

        int actRes = div(divident, divisor);
        assertEquals(expRes, actRes);
    }

    @Test
    public void example3() {
        int divident = -2147483648;
        int divisor  = -1;
        int expRes   = 2147483647;

        int actRes = div(divident, divisor);
        assertEquals(expRes, actRes);
    }

    @Test
    public void example4() {
        int divident = 2147483647;
        int divisor  = 2;
        int expRes   = 2147483647 / 2;

        int actRes = div(divident, divisor);
        assertEquals(expRes, actRes);
    }

    @Test
    public void example5() {
        int divident = -2147483648;
        int divisor  = 1;
        int expRes   = -2147483648;

        int actRes = div(divident, divisor);
        assertEquals(expRes, actRes);
    }

    @Test
    public void myTest1() {
        int divident = 0;
        int divisor  = 3;
        int expRes   = 0;

        int actRes = div(divident, divisor);
        assertEquals(expRes, actRes);
    }

    @Test
    public void myTest2() {
        int divident = 0;
        int divisor  = -1;
        int expRes   = 0;

        int actRes = div(divident, divisor);
        assertEquals(expRes, actRes);
    }

    @Test
    public void myTest3() {
        int divident = 100;
        int divisor  = 99;
        int expRes   = 1;

        int actRes = div(divident, divisor);
        assertEquals(expRes, actRes);
    }

    @Test
    public void myTest4() {
        int divident = -100;
        int divisor  = 99;
        int expRes   = -1;

        int actRes = div(divident, divisor);
        assertEquals(expRes, actRes);
    }

    @Test
    public void myTest5() {
        int divident = 100;
        int divisor  = 1;
        int expRes   = 100;

        int actRes = div(divident, divisor);
        assertEquals(expRes, actRes);
    }

    @Test
    public void myTest6() {
        int divident = 100;
        int divisor  = -1;
        int expRes   = -100;

        int actRes = div(divident, divisor);
        assertEquals(expRes, actRes);
    }

    @Test
    public void myTest7() {
        int divident = Integer.MAX_VALUE;
        int divisor  = 2;
        int expRes   = Integer.MAX_VALUE / 2;

        int actRes = div(divident, divisor);
        assertEquals(expRes, actRes);
    }

    @Test
    public void myTest8() {
        int divident = -2147483648;
        int divisor  = 1;
        int expRes   = -2147483648;

        int actRes = div(divident, divisor);
        assertEquals(expRes, actRes);
    }


    @Test
    public void example6() {
        int divident = -2147483648;
        int divisor  = 2;
        int expRes   = -1073741824;

        int actRes = div(divident, divisor);
        assertEquals(expRes, actRes);
    }

    @Test
    public void myTest9() {
        int divident = Integer.MIN_VALUE;
        int divisor  = Integer.MIN_VALUE;
        int expRes   = 1;

        int actRes = div(divident, divisor);
        assertEquals(expRes, actRes);
    }

}
