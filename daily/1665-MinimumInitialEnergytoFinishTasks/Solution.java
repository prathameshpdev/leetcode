import java.util.*;

class Solution {
    public static int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> a[1] - a[0] - (b[1] - b[0]));
        int ans = 0;
        for (int[] task : tasks) {
            ans = Math.max(ans + task[0], task[1]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] input = {
                {1, 3},
                {2, 4},
                {10, 11},
                {10, 12},
                {8, 9}
        };
        int result = minimumEffort(input);
        System.out.println("The minimum initial amount of energy you will need to finish all the tasks " + result);
    }
}