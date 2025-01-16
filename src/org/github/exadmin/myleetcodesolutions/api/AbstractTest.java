package org.github.exadmin.myleetcodesolutions.api;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public abstract class AbstractTest {
    public void assertArraysEquals(int[] expArr, int[] actArr) {
        assertNotNull(expArr);
        assertNotNull(actArr);
        assertEquals(expArr.length, actArr.length);

        try {
            for (int i = 0; i < expArr.length; i++) {
                assertEquals("Different values at " + i + " index: expArr[] == " + expArr[i] + ", actArr[] == " + actArr[i], expArr[i], actArr[i]);
            }
        } catch (AssertionError err) {
            System.out.println("Assertion is failed for arrays:");
            System.out.println("expArr  = " + Arrays.toString(expArr));
            System.out.println("actArr  = " + Arrays.toString(actArr));
            throw err;
        }
    }
}
