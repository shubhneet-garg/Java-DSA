// LeetCode 451 - Sort Characters by Frequency
//
// Time Complexity: O(n)
// Space Complexity: O(n)
//
// Approach:
// 1. Count the frequency of each character using a frequency array.
// 2. Create buckets where bucket[i] stores all characters having frequency i.
// 3. Traverse the buckets from highest frequency to lowest.
// 4. Append each character frequency number of times to build the answer.
package String.Medium;
import java.util.*;
class FrequencySort {
    public String frequencySort(String s) {

        // Step 1: Count frequency of each character
        int[] freq = new int[128];

        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        // Step 2: Create buckets
        List<Character>[] bucket = new ArrayList[s.length() + 1];

        // Step 3: Place each character into its frequency bucket
        for (int i = 0; i < 128; i++) {

            if (freq[i] > 0) {

                if (bucket[freq[i]] == null) {
                    bucket[freq[i]] = new ArrayList<>();
                }

                bucket[freq[i]].add((char) i);
            }
        }

        // Step 4: Build the answer
        StringBuilder ans = new StringBuilder();

        for (int f = s.length(); f >= 1; f--) {

            if (bucket[f] != null) {

                for (char ch : bucket[f]) {

                    for (int i = 0; i < f; i++) {
                        ans.append(ch);
                    }
                }
            }
        }

        return ans.toString();
    }
}