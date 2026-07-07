//Platform: GFG
//Difficulty: Easy;
//Time Complexity: O(n log n + n log(maxDistance))
//Space Complexity: O(1)

import java.util.Arrays;
public class Main {
    public static int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);

        int low = 1;
        int high = arr[arr.length - 1] - arr[0];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlaceCows(arr, k, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
    public static boolean canPlaceCows(int[] arr, int k, int minDistance) {
        int count = 1;              // First cow is placed at the first stall
        int lastPlaced = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastPlaced >= minDistance) {
                count++;
                lastPlaced = arr[i];

                if (count == k) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 7, 5};
        int k = 3;
        int ans = aggressiveCows(arr, k);
        System.out.println("Maximum minimum distance = " + ans);
    }
}