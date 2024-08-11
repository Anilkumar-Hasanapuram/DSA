class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<Integer>();
        for(int value:nums)
        {
            if(set.contains(value))
            {
                return true;
            }
            else
            {
                set.add(value);
            }
        }
        return false;
    }
}