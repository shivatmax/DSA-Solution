import java.util.HashMap;
import java.util.Map;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the elements of the array as keys and their indices as values.
        HashMap<Integer, Integer> map = new HashMap<>();
        // Iterate through the array.
        for(int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current element by subtracting it from the target.
            int complement = target - nums[i];
            // Check if the complement exists in the map. If it does, a solution is found.
            if(map.containsKey(complement)) {
                // Return the indices of the current element and the complement.
                return new int[] { map.get(complement), i };
            }
            // If no solution is found, add the current element and its index to the map.
            map.put(nums[i], i);
        }
        // If no two numbers sum up to the target, return [-1, -1] as an indication.
        return new int[] { -1, -1 }; 
    }
}
