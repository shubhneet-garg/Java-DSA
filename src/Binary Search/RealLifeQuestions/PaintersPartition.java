// Platform: GFG
// Problem: Painter's Partition Problem
// Difficulty: Medium
// Time Complexity: O(n * log(sum(arr)))
// Space Complexity: O(1)

public class PaintersPartition {

    public static int minTime(int[] arr, int k) {
        int low = 0;
        int high = 0;

        for (int board : arr) {
            low = Math.max(low, board);
            high += board;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPaint(arr, k, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private static boolean canPaint(int[] arr, int k, int maxTime) {
        int painters = 1;
        int currentTime = 0;

        for (int board : arr) {
            if (currentTime + board <= maxTime) {
                currentTime += board;
            } else {
                painters++;
                currentTime = board;

                if (painters > k) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 30, 20, 15};
        int k = 3;

        System.out.println("Minimum Time: " + minTime(arr, k));
    }
}