// LeetCode 1021 - Remove Outermost Parentheses
//
// Time Complexity: O(n)
// Space Complexity: O(n)
//
// Approach:
// 1. Traverse the string while maintaining the depth (open count).
// 2. Append '(' only if it is not the outermost opening parenthesis.
// 3. Append ')' only if it is not the outermost closing parenthesis.

class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();
        int open = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                if (open > 0) {
                    ans.append(ch);
                }
                open++;
            } else {
                open--;
                if (open > 0) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }
}