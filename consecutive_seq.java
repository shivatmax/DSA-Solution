import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int longestConsecutive(int[] nums) {
        // Handle the case where the input array is empty
        if (nums.length == 0) return 0;

        // Sort the array to make it easier to find consecutive sequences
        Arrays.sort(nums);
        
        // Create an ArrayList to store lengths of consecutive sequences found
        ArrayList<Integer> numsList = new ArrayList<>();
        
        // Initialize the count of the current consecutive sequence
        int c = 1;
        
        // Iterate through the array to find all consecutive sequences
        for (int n = 0; n < nums.length - 1; n++) {
            // If the current element and the next one are consecutive
            if (nums[n] + 1 == nums[n + 1]) {
                c++; // Increase the count
            } else if (nums[n] != nums[n + 1]) { // If they are not consecutive and not duplicates
                numsList.add(c); // Add the count of the current sequence to the list
                c = 1; // Reset the count for the next sequence
            }
            // Note: Duplicate elements are effectively skipped over without resetting the count
        }
        numsList.add(c); // Add the count of the last sequence
        
        // Find and return the maximum length from the list of sequence lengths
        return Collections.max(numsList);
    }
}
