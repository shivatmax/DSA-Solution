import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Sort the array to facilitate two-pointer approach
        List<List<Integer>> arr = new LinkedList(); // Initialize the result list

        // Iterate through the array, considering each element as a potential first element of a triplet
        for(int i=0; i<nums.length-2; i++){
            // Skip duplicate elements to avoid duplicate triplets
            if(i==0 || (i>0 && nums[i] != nums[i-1])){
                int low = i+1; // Initialize the second element of the triplet
                int high = nums.length-1; // Initialize the third element of the triplet
                int sum = 0 - nums[i]; // The sum needed from the second and third elements

                // Use two-pointer technique to find pairs that sum up to the required value
                while(low < high){
                    if(nums[low] + nums[high] == sum){ // If the pair sums up to the target value
                        // Add the triplet to the result list
                        arr.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        // Skip duplicate elements for the second element
                        while(low < high && nums[low] == nums[low+1]) low++;
                        // Skip duplicate elements for the third element
                        while(low < high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;       
                    }else if(nums[low] + nums[high] > sum){ // If the pair sum is too large, move the third element left
                        high--;
                    }
                    else{ // If the pair sum is too small, move the second element right
                        low++;
                    }
                }
            }
        }
        return arr; // Return the list of triplets
    }
}
