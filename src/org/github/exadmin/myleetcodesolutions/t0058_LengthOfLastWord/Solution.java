package org.github.exadmin.myleetcodesolutions.t0058_LengthOfLastWord;

class Solution {
    public int lengthOfLastWord(String s) {
        int index = s.length();
        boolean clearingSpaces = true;
        int wordLength = 0;

        while (index > 0) {
            index--;
            if (s.charAt(index) == ' ') {
                if (clearingSpaces) continue;
                return wordLength;
            }

            clearingSpaces = false;
            wordLength++;
        }

        return wordLength;
    }
}