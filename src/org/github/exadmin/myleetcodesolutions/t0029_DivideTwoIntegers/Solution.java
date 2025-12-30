package org.github.exadmin.myleetcodesolutions.t0029_DivideTwoIntegers;

class Solution {
    public int divide(final int dividend, final int divisor) {
        // work with division by 1 as exceptional case
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (divisor == 1) return dividend;
        if (divisor == -1) return -dividend;

        // work with division by specificly large numbers
        if (divisor == Integer.MIN_VALUE) {
            if (dividend == Integer.MIN_VALUE) return 1;
            return 0;
        }

        if (divisor == Integer.MAX_VALUE) {
            if (dividend == Integer.MIN_VALUE) return -1;
            if (dividend == Integer.MIN_VALUE + 1) return -1;
            if (dividend == Integer.MAX_VALUE) return 1;

            return 0;
        }

        // switch to normal diapason
        int extra = 0;
        int modDivident = dividend;
        if (modDivident == Integer.MIN_VALUE) {
            modDivident = Integer.MIN_VALUE + 1;
            extra = 1;
        }

        modDivident = modDivident < 0 ? -modDivident : modDivident;
        int modDivisor  = divisor < 0 ? -divisor : divisor;



        int result = 0;
        while (modDivident >= modDivisor) {
            result++;
            modDivident = modDivident - modDivisor;

            if (extra == 1) {
                modDivident = modDivident + extra;
                extra = 0;
            }
        }

        if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) return result;

        return -result;
    }
}