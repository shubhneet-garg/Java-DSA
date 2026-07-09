// LeetCode 1903 - Largest Odd Number in a String
//
// Time Complexity: O(n)
// Space Complexity: O(1)
//
// Approach:
// 1. Traverse the string from right to left.
// 2. Find the first odd digit.
// 3. Return the substring from index 0 to that digit; otherwise return "".
package String.Basic;
import java.util.*;
class largestoddnumber {
    public String largestOddNumber(String num) {

        for (int i = num.length() - 1; i >= 0; i--) {

            char ch = num.charAt(i);

            if ((ch - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}