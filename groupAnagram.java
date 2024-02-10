import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Check if the input array is null or empty. If so, return an empty list.
        if (strs == null || strs.length == 0) return new ArrayList<>();
        // Create a HashMap to map a sorted string (or character count string) to a list of its anagrams.
        Map<String, List<String>> map = new HashMap<>();

        // Iterate through each string in the input array.
        for (String s: strs) {
            // Create an array to count the frequency of each character in the string.
            char[] cArr = new char[26]; // Since there are 26 lowercase alphabets.
            for (char c: s.toCharArray()) cArr[c - 'a']++; // Increment the count for each character.
            // Convert the character count array into a string to use as a key in the map.
            String keyStr = String.valueOf(cArr);
            // If the key does not exist in the map, initialize it with a new list.
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            // Add the original string to the list corresponding to its key.
            map.get(keyStr).add(s);
        }

        // Return the grouped anagrams as a list of lists.
        return new ArrayList<>(map.values());
    }
}
