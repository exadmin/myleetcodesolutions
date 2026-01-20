package org.github.exadmin.myleetcodesolutions.t0023;

import org.junit.Test;

public class MergeKSortedListsTest {

    @Test
    public void example1() {
        ListNode[] lists = new ListNode[3];
        lists[0] = createFrom(new int[] {1, 4, 5});
        lists[1] = createFrom(new int[] {1, 3, 4});
        lists[2] = createFrom(new int[] {2, 6});

        System.out.println("ttt" + lists);

        Solution solution = new Solution();
        ListNode node = solution.mergeKLists(lists);

        while (node != null) {
            System.out.print("," + node.val);
            node = node.next;
        }
    }

    private static ListNode createFrom(int[] array) {
        ListNode next = null;

        int index = array.length;
        while (--index >= 0) {
            next = new ListNode(array[index], next);
        }

        return next;
    }
}
