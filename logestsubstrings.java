import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(); // Length of the input string
        int maxLength = 0; // Initialize the length of the longest substring
        Set<Character> charSet = new HashSet<>(); // Create a Set to store characters
        int left = 0; // Initialize the left pointer
        
        // Iterate through the string with the right pointer
        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                // If the character is not in the Set, add it and update the maxLength
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                // If the character is already in the Set, remove characters from the left
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                // After removing, add the current character to the Set
                charSet.add(s.charAt(right));
            }
        }
        return maxLength; // Return the length of the longest substring
    }
}
