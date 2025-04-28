class Solution {
   static int majorityElement(int arr[]) {
        int n = arr.length;

        // Step 1: Find the candidate for majority element
        int candidate = -1, count = 0;
        
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify if the candidate is the majority element
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        // If the count is more than n/2, return the candidate
        if (count > n / 2) {
            return candidate;
        }

        // No majority element found
        return -1;
    }
}