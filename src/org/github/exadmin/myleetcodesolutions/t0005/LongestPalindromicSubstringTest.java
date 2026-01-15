package org.github.exadmin.myleetcodesolutions.t0005;

import org.junit.Test;

import java.util.Arrays;

public class LongestPalindromicSubstringTest {

    private static void test(String inString, String ... possibleStrings) {
        Solution solution = new Solution();

        String actStr = solution.longestPalindrome(inString);

        boolean matched = false;
        for (String pStr : possibleStrings) {
            if (pStr.equals(actStr)) {
                matched = true;
                break;
            }
        }

        if (!matched) throw new IllegalStateException("Actual result = '" + actStr + "' was not found in possible variants: " + Arrays.toString(possibleStrings));
   }

    @Test
    public void example1() {
        test("babad", "bab", "aba");
    }

    @Test
    public void example2() {
        test("cbbd", "bb");
    }

    @Test
    public void myTest1() {
        test("a12345b54321abc", "a12345b54321a");
    }

    @Test
    public void myTest2() {
        test("a12345bb54321abc", "a12345bb54321a");
    }

    @Test
    public void myTest3() {
        test("zxcvbnmasdfhjklqwertyuiopa12345bb54321abc", "a12345bb54321a");
    }

    @Test
    public void myTest4() {
        test("zxcvbnmasdfhjklqwertyuiopa12345bRb54321abc", "a12345bRb54321a");
    }

    @Test
    public void myTest5() {
        test("aaaaa", "aaaaa");
    }

    @Test
    public void myTest6() {
        test("aaaaaa", "aaaaaa");
    }

    @Test
    public void fail1() {
        test("bb", "bb");
    }

    @Test
    public void myTest7() {
        test("aaaa", "aaaa");
    }

    @Test
    public void myTest8() {
        test("ccaa", "cc", "aa");
    }

    @Test
    public void fail2() {
        test("ccd", "cc");
    }
}
