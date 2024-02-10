import java.util.Arrays;

class Solution {
    // Method to check if two strings are anagrams of each other
    public boolean isAnagram(String s, String t) {
        // Initially, assume the strings are not anagrams
        boolean IsAnagram = false;
        
        // Convert both strings to character arrays
        char[] tempArray = s.toCharArray();
        char[] tempArray1 = t.toCharArray();
        
        // Sort the character arrays
        Arrays.sort(tempArray);
        Arrays.sort(tempArray1);
        
        // Convert the sorted arrays back to strings
        String s1 = String.valueOf(tempArray);
        String s2 = String.valueOf(tempArray1);
        
        // Compare the sorted strings to check if they are equal
        if (s1.equals(s2)) {
            // If the sorted strings are equal, the original strings are anagrams
            IsAnagram = true;
        }
        
        // Return the result
        return IsAnagram;
    }
}
