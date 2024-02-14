class Solution {
    public boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert to lowercase
        String ns = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len = ns.length(); // Get the length of the cleaned string
        
        // Check if the cleaned string is a palindrome
        for (int i = 0; i < len / 2; i++) { // Iterate over the first half of the string
            if (ns.charAt(i) != ns.charAt(len - 1 - i)) { // Compare characters from both ends
                return false; // If any pair doesn't match, it's not a palindrome
            }
        }
        
        // If all pairs match, it's a palindrome
        return true;
    }
}
