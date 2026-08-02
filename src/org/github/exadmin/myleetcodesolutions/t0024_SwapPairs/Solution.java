package org.github.exadmin.myleetcodesolutions.t0024_SwapPairs;

/**
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 * <a href="https://leetcode.com/problems/swap-nodes-in-pairs/description/">task</a>
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode resultHead = null;
        ListNode prevPairLastNode = null;

        while (head != null) {
            ListNode first = head;
            ListNode second = head.next;

            if (second != null) {
                ListNode tmp = second.next;
                second.next = first;
                first.next = tmp;

                if (prevPairLastNode != null) prevPairLastNode.next = second;
                if (resultHead == null) resultHead = second;
            }

            if (resultHead == null) resultHead = first;

            prevPairLastNode = first;
            head = first.next;
        }

        return resultHead;
    }
}