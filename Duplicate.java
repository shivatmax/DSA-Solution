/**
 * Checks if the input array contains any duplicate integers.
 * It leverages a HashSet to record each element it encounters.
 * As we iterate over the array, we try to add each element to the set.
 * The add operation will return false if the element is already present in the set,
 * which indicates a duplicate is found and we return true.
 * If no duplicates are encountered throughout the loop, we return
 * false,confirming all elements in the array are unique.
 */
import java.util.HashSet;
import java.util.Set;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) { // add returns false if the set already contains the element
                return true;
            }
        }
        return false;
    }
}