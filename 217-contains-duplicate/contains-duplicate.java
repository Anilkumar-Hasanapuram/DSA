class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        for(int value:nums)
        {
            set.add(value);
        }
        if(set.size()!=nums.length)
        {
            return true;
        }
        return false;
    }
}