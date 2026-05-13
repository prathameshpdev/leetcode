import java.util.*;

class Solution {
    // Method to separate digits of each number in the array
    public static int[] separateDigits(int[] nums) {
        List<Integer> res = new ArrayList<>();
        // Loop through each number in the input array
        for(int i: nums) {
            // Temporary list to hold digits of the current number
            List<Integer> tmp = new ArrayList<>();
            // Extract digits one by one (from last digit to first)
            while (i > 0) {
                tmp.add(i % 10); // %10 gives the last digit
                i /= 10; // remove the last digit by dividing by 10
            }
            // Digits were collected in reverse order, so add them back in correct order
            for (int j = tmp.size() - 1; j >= 0; j--) {
                res.add(tmp.get(j));
            }
        }

        int[] answer = new int[res.size()];
        for(int i=0; i<res.size(); i++) {
            answer[i] = res.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {13,25,83,77};
        int answer[] = separateDigits(nums);
        System.out.println("The separation of each integer in nums is" + Arrays.toString(answer));
    }
}