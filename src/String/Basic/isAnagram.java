// LeetCode 242 - Valid Anagram
//
// Time Complexity: O(n)
// Space Complexity: O(1)
//
// Approach:
// 1. If the lengths are different, return false.
// 2. Count the frequency of each character in the first string.
// 3. Decrease the frequency using the second string.
// 4. If all frequencies become 0, the strings are anagrams.

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}