import java.util.*;

public class Solution {
    public int longestSquareStreak(int[] nums) {
        // Use a HashSet to store unique numbers for quick lookup
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxStreak = -1;

        // Iterate through each number and try to find the longest square streak
        for (int num : nums) {
            int length = 1;
            int current = num;

            while (current <= Math.sqrt(Integer.MAX_VALUE) && numSet.contains(current * current)) {
                current *= current;
                length++;
            }

            if (length >= 2) {
                maxStreak = Math.max(maxStreak, length);
            }
        }

        return maxStreak;
    }
}
