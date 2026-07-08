// LeetCode 205 - Isomorphic Strings
//
// Time Complexity: O(n)
// Space Complexity: O(1)
//
// Approach:
// 1. Use two arrays to store the mapping from s -> t and t -> s.
// 2. If a mapping already exists and doesn't match, return false.
// 3. If the traversal completes, the strings are isomorphic.

class Solution {
    public boolean isIsomorphic(String s, String t) {

        int[] mapST = new int[256];
        int[] mapTS = new int[256];

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (mapST[ch1] != mapTS[ch2]) {
                return false;
            }

            mapST[ch1] = i + 1;
            mapTS[ch2] = i + 1;
        }

        return true;
    }
}