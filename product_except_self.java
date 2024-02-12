class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length; // Get the length of the input array.
        int prefixProduct = 1; // Initialize the prefix product as 1.
        int suffixProduct = 1; // Initialize the suffix product as 1.
        int[] result = new int[len]; // Initialize the result array of the same length as the input array.

        // Calculate the prefix product for each element.
        for(int i = 0; i < len; i++) {
            // Set the current element of the result array to the current prefix product.
            result[i] = prefixProduct;
            // Update the prefix product by multiplying it with the current element of the input array.
            prefixProduct *= nums[i];
        }

        // Calculate the suffix product for each element, in reverse order.
        for(int i = len-1; i >= 0; i--) {
            // Multiply the current element of the result array by the current suffix product.
            result[i] *= suffixProduct;
            // Update the suffix product by multiplying it with the current element of the input array.
            suffixProduct *= nums[i];
        }

        // Return the final result array.
        return result;
    }
}
