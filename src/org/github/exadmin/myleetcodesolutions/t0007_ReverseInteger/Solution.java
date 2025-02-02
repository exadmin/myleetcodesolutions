package org.github.exadmin.myleetcodesolutions.t0007_ReverseInteger;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * DONE = 100% beats by performance
 */
class Solution {
    public int reverse(int inValue) {
        boolean isNegative = inValue < 0;
        if (isNegative) inValue = -inValue;

        int resultValue = 0;
        while (inValue > 0) {
            int lastDigit = inValue % 10;
            inValue = inValue / 10;
            // Integer.MAX_VALUE = 2 147 483 647
            if (resultValue >= 214748365) return 0;
            if (resultValue >= 214748364 && lastDigit >=7 ) return 0;
            resultValue = resultValue * 10 + lastDigit;
        }

        return isNegative ? -resultValue : resultValue;
    }
}