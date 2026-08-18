class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;
        int[] count = new int[51];

        // Number of windows in which each value appears
        int[] windowCount = new int[51];

        // First window
        for (int i = 0; i < k; i++) {
            count[nums[i]]++;
        }

        // Count numbers present in first window
        for (int x = 0; x <= 50; x++) {
            if (count[x] > 0) {
                windowCount[x]++;
            }
        }

        // Slide the window
        for (int i = k; i < n; i++) {

            // Remove left element
            count[nums[i - k]]--;

            // Add new right element
            count[nums[i]]++;

            // Count which numbers are present
            for (int x = 0; x <= 50; x++) {
                if (count[x] > 0) {
                    windowCount[x]++;
                }
            }
        }

        // Find largest number present in exactly one window
        for (int x = 50; x >= 0; x--) {
            if (windowCount[x] == 1) {
                return x;
            }
        }

        return -1;
    }
}