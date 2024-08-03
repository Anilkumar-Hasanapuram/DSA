class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int value=Math.abs(nums[i]);
            nums[i]=value*value;
        }
        Arrays.sort(nums);
        return nums;
    }
}