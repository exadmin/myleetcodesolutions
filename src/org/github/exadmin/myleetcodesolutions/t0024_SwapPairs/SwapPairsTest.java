package org.github.exadmin.myleetcodesolutions.t0024_SwapPairs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwapPairsTest {
    private static ListNode toList(int[] array) {
        if (array == null || array.length == 0) return null;

        ListNode prevNode = null;
        for (int i = array.length - 1; i>=0; i--) {
            ListNode curNode = new ListNode(array[i]);
            curNode.next = prevNode;
            prevNode = curNode;
        }

        return prevNode;
    }

    private static void compare(int[] expValues, ListNode testListHeadNode) {
        if (expValues == null || expValues.length == 0) {
            if (testListHeadNode != null) throw new IllegalStateException("Test list head node must be null");
            return;
        }

        ListNode node = testListHeadNode;
        for (int i=0; i<expValues.length; i++) {
            int expValue = expValues[i];
            if (node == null) throw new IllegalStateException("Expected node with " + expValue + ", but it is null");
            assertEquals(expValue, node.val);

            node = node.next;
        }
    }

    @Test
    public void testToListSunnyDay() {
        int[] array = new int[] {1, 2, 3, 4, 5};
        ListNode head = toList(array);

        compare(array, head);
    }

    @Test(expected = AssertionError.class)
    public void testToListRainyDay() {
        int[] array = new int[] {1, 2, 3, 4, 5};
        ListNode head = toList(array);

        int[] badArray = new int[] {1, 2, 33, 4, 5};

        compare(badArray, head);
    }

    private static void doTest(int[] inArray, int[] expArray) {
        Solution solution = new Solution();
        ListNode orgHead = toList(inArray);
        ListNode newNode = solution.swapPairs(orgHead);

        compare(expArray, newNode);
    }

    @Test
    public void oobTest1() {
        int[] inArray = new int[] {1, 2, 3, 4};
        int[] expArray = new int[] {2, 1, 4, 3};

        doTest(inArray, expArray);
    }

    @Test
    public void oobTest2() {
        int[] inArray = new int[] {1};
        int[] expArray = new int[] {1};

        doTest(inArray, expArray);
    }

    @Test
    public void oobTest3() {
        int[] inArray = new int[] {};
        int[] expArray = new int[] {};

        doTest(inArray, expArray);
    }

    @Test
    public void oobTest4() {
        int[] inArray = new int[] {1, 2, 3};
        int[] expArray = new int[] {2, 1, 3};

        doTest(inArray, expArray);
    }

    @Test
    public void myTest5() {
        int[] inArray = new int[] {1, 2, 3, 4, 2, 1};
        int[] expArray = new int[] {2, 1, 4, 3, 1, 2};

        doTest(inArray, expArray);
    }
}
