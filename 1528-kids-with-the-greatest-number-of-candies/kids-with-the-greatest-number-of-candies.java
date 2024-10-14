class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> b=new ArrayList<>();
        int maxvalue=Arrays.stream(candies).max().getAsInt();
        for(int value:candies)
        {
            int total=value+extraCandies;
            if(total>=maxvalue)
            {
                b.add(true);
            }
            else
            {
                b.add(false);
            }
        }
        return b;
        
    }
}