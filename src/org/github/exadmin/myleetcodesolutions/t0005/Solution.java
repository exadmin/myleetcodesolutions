package org.github.exadmin.myleetcodesolutions.t0005;

class Solution {

    public String longestPalindrome(String str) {
        String s1 = longestPalindrome(str, 0);
        String s2 = longestPalindrome(str, 1);


        if (s1.length() > s2.length()) return s1;
        return s2;
    }

    private String longestPalindrome(String str, final int fix) {
        if (str.length() == 1) return str;
        if (str.length() == 2) {
            if (str.charAt(0) == str.charAt(1)) {
                return str;
            }

            return "" + str.charAt(0);
        }

        int bestIndex = -1;
        int bestLength = -1;

        // iterate over chars - suggesting that current char is a middle of the palindrome
        // then try to go to both directions comparing chars for equality
        // special case: if current and next char are similar - try inject special char between
        int strLength = str.length();
        for (int curIndex=0; curIndex<strLength; curIndex++) {
            int curLength = 1;

            while (true) {
                int leftIndex = curIndex - curLength + fix;
                int rightIndex = curIndex + curLength;

                if (leftIndex >= 0 && rightIndex < strLength) {
                    char leftCh = str.charAt(leftIndex);
                    char rightCh = str.charAt(rightIndex);

                    if (leftCh != rightCh) break;

                    if (curLength > bestLength) {
                        bestLength = curLength;
                        bestIndex = curIndex;
                    }

                    curLength++;


                } else {
                    break;
                }
            }
        }

        if (bestIndex == -1) return "" + str.charAt(0);

        int fromIndex = bestIndex - bestLength + fix;
        int toIndex = bestIndex + bestLength + 1;

        return str.substring(fromIndex, toIndex);
    }
}