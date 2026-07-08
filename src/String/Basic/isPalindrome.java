// Palindrome Check
//
// Time Complexity: O(n)
// Space Complexity: O(1)
//
// Approach:
// 1. Use two pointers: one at the beginning and one at the end.
// 2. Compare characters while moving both pointers inward.
// 3. If any pair doesn't match, return false; otherwise return true.

class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}