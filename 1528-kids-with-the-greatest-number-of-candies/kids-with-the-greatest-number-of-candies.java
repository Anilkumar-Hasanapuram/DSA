class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> b=new ArrayList<>(candies.length);
        int maxvalue=Arrays.stream(candies).max().getAsInt();
        int total=0;
        for(int value:candies)
        {
            total=value+extraCandies;
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