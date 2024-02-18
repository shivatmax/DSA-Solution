class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1; // Initialize two pointers at the ends of the array
        int water, maxWater = 0; // Initialize variables to track current and maximum water area

        // Loop until the two pointers meet
        while(left < right) {
            // Determine the shorter line and calculate the area
            if(height[left] < height[right]) {
                water = height[left] * (right - left); // Area is limited by the shorter line (left)
                ++left; // Move the left pointer inward
            } else {
                water = height[right] * (right - left); // Area is limited by the shorter line (right)
                --right; // Move the right pointer inward
            }
            // Update maxWater if the current area is greater than the previously recorded maximum area
            if(water > maxWater) maxWater = water;
        }
        return maxWater; // Return the maximum area found
    }
}
