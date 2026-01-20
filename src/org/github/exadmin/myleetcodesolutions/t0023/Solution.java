package org.github.exadmin.myleetcodesolutions.t0023;

import java.util.Arrays;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        final ListNode resultNode = new ListNode();
        ListNode nextResultNode = resultNode;

        // setup pointers to first elements of each list
        ListNode[] pIndexes = new ListNode[lists.length];
        System.arraycopy(lists, 0, pIndexes, 0, lists.length);

        while (true) {
            // select minimal value and pointer ot base on
            int minValue = Integer.MAX_VALUE;
            int selectedIndex = -1;
            for (int i = 0; i < pIndexes.length; i++) {
                if (pIndexes[i] == null) continue;

                ListNode testNode = pIndexes[i];
                if (testNode.val < minValue) {
                    selectedIndex = i;
                    minValue = testNode.val;
                }
            }

            if (selectedIndex == -1) return resultNode; // todo remove last fake element

            ListNode minNode = pIndexes[selectedIndex];
            nextResultNode.val = minNode.val;
            nextResultNode.next = new ListNode();
            nextResultNode = nextResultNode.next;

            pIndexes[selectedIndex] = minNode.next;
        }
    }
}