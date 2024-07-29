class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            if (min + n == 0) {
                min = min > 0 ? min : n;
            } else if (Math.abs(min) > Math.abs(n)) {
                min = n;
            }
        }
        return min;
    }
}