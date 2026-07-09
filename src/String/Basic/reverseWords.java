// Reverse Words in a Given String
//
// Time Complexity: O(n)
// Space Complexity: O(n)
//
// Approach:
// 1. Remove leading/trailing spaces and split the string by one or more spaces.
// 2. Traverse the words from last to first.
// 3. Append each word with a single space between them.
package String.Basic;
import java.util.*;
class reverse {
    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);

            if (i != 0) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}