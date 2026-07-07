// Platform: GFG
// Difficulty: Medium
// Time Complexity: O(n * log(sum(arr) - max(arr)))
// Space Complexity: O(1)

public class AllocateMinimumPages {

    public static int findPages(int[] arr, int k) {

        if (k > arr.length) {
            return -1;
        }

        long low = 0;
        for (int i : arr) {
            low = Math.max(low, i);
        }

        long high = 0;
        for (int i : arr) {
            high += i;
        }

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (canAllocate(arr, k, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) low;
    }

    public static boolean canAllocate(int[] arr, int k, long maxPages) {

        int students = 1;
        long pages = 0;

        for (int i = 0; i < arr.length; i++) {

            if (pages + arr[i] <= maxPages) {
                pages += arr[i];
            } else {
                students++;
                pages = arr[i];

                if (students > k) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {12, 34, 67, 90};
        int k = 2;

        int ans = findPages(arr, k);

        System.out.println("Minimum possible maximum pages = " + ans);
    }
}