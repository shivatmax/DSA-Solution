import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Create a HashMap to store each unique number as a key and its frequency as the value.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            // Update the frequency of each number in the array.
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Convert the set of keys in the map to an ArrayList for sorting.
        ArrayList<Integer> list = new ArrayList<Integer>(map.keySet());
        // Sort the list based on the frequency of each number in descending order.
        list.sort((a,b)->map.get(b)-map.get(a));

        // Initialize an array to store the top k frequent numbers.
        int[] result = new int[k];
        // Fill the result array with the top k frequent numbers.
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }
        // Return the result array.
        return result;
    }
}
