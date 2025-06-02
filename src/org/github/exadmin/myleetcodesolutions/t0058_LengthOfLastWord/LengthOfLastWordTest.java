package org.github.exadmin.myleetcodesolutions.t0058_LengthOfLastWord;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthOfLastWordTest {

    private void doTest(String inStr, int expSize) {
        Solution solution = new Solution();
        int actSize = solution.lengthOfLastWord(inStr);

        assertEquals(expSize, actSize);
    }

    @Test
    public void case01() {
        String inStr = "Hello World";
        int expSize = 5;

        doTest(inStr, expSize);
    }

    @Test
    public void case02() {
        String inStr = "   fly me   to   the moon  ";
        int expSize = 4;

        doTest(inStr, expSize);
    }

    public void case03() {
        String inStr = "luffy is still joyboy";
        int expSize = 6;

        doTest(inStr, expSize);
    }

    @Test
    public void myCase01() {
        doTest("oneword", 7);
    }

    @Test
    public void myCase02() {
        doTest("o", 1);
    }

    @Test
    public void myCase01_withSpaces() {
        doTest("oneword   ", 7);
    }

    @Test
    public void myCase02_withSpaces() {
        doTest("o   ", 1);
    }

    @Test
    public void myCase01_withSpaces2() {
        doTest("oneword ", 7);
    }

    @Test
    public void myCase02_withSpaces2() {
        doTest("o ", 1);
    }

    ///
    @Test
    public void myCase01_leadingSpaces() {
        doTest("   oneword", 7);
    }

    @Test
    public void myCase02_leadingSpaces() {
        doTest("   o", 1);
    }

    @Test
    public void myCase01_withSpaces_leadingSpaces() {
        doTest(" oneword ", 7);
    }

    @Test
    public void myCase02_withSpaces_leadingSpaces() {
        doTest(" o", 1);
    }

    @Test
    public void myCase01_withSpaces2_leadingSpaces() {
        doTest("        oneword              ", 7);
    }

    @Test
    public void myCase02_withSpaces2_leadingSpaces() {
        doTest(" o ", 1);
    }

}
