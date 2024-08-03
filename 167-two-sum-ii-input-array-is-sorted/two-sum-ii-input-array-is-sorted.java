class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=i+1;
        while(i<numbers.length-1){
            while(j<numbers.length){
            if(numbers[i]+numbers[j]==target)
            return new int[]{i+1,j+1};
            j++;
            }
            i++;
            j=i+1;
        }
        return new int[]{};
    }
}