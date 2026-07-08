// LeetCode 796 - Rotate String
//
// Time Complexity: O(n)
// Space Complexity: O(n)
//
// Approach:
// 1. If the lengths are different, return false.
// 2. Concatenate the original string with itself.
// 3. If goal is a substring of the concatenated string, return true.

class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String doubled = s + s;

        return doubled.contains(goal);
    }
}
