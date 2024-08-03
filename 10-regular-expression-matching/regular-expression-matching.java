class Solution {
    public boolean isMatch(String s, String p) {
        // Call the recursive helper function
        return isMatchHelper(s, p, 0, 0);
    }

    private boolean isMatchHelper(String s, String p, int i, int j) {
        // If we reach the end of the pattern
        if (j == p.length()) {
            return i == s.length();
        }

        // Check if the current character of s matches the current character of p
        boolean firstMatch = (i < s.length() && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.'));

        // If the next character in the pattern is '*'
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            // Two cases: 
            // 1. We ignore the '*' and the preceding character
            // 2. We consider the '*' and check if the current characters match
            return (isMatchHelper(s, p, i, j + 2) ||
                    (firstMatch && isMatchHelper(s, p, i + 1, j)));
        } else {
            // If no '*', just move to the next character in both s and p
            return firstMatch && isMatchHelper(s, p, i + 1, j + 1);
        }
    }
}
