class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        { 
            int sort=0;
            for(int j=0;j<n-1-i;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int swap=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=swap;
                    sort=1;
                }
            }
            if(sort==0)
            {
                break;
            }
        }
    }
}