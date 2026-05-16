import java.util.*;

class Solution {
    public static int findMin(int[] nums) {
        int n = nums.length - 1;
        // last stores the value of the last element
        int last = nums[n];
        // left starts at 0 (beginning), right starts at n (end)
        int left = 0, right = n;

        // Skip over duplicates of the last element from the left side
        while (left < n && nums[left] == last)
            left++;

        // Binary search loop to find the minimum
        while (left < right) {
            // mid is the middle index between left and right
            // (Note: '>> 1' means divide by 2 using bit shift)
            int mid = left + right >> 1;

            // If middle element is greater than last element,
            // the minimum must be to the right of mid
            if (nums[mid] > last)
                left = mid + 1;
            else
                // Otherwise, the minimum is at mid or to the left of mid
                right = mid;
        }

        // When loop ends, left points to the minimum element
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5};
        int result = findMin(nums);
        System.out.println("Minimum value from the given array is " + result);
    }
}