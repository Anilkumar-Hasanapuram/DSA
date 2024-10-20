class Solution {
    public int equalPairs(int[][] grid) {
        List<List<Integer>> n1=new ArrayList<>();
        for(int value[]:grid)
        {
            List<Integer> s2=new ArrayList();
            for(int v:value)
            {
                s2.add(v);
            }
            n1.add(s2);

        }
        List<List<Integer>> n2=new ArrayList<>();
        for(int i=0;i<grid[0].length;i++)
        {
            List<Integer> s2=new ArrayList();
            for(int j=0;j<grid.length;j++)
            {
                s2.add(grid[j][i]);
            }
            n2.add(s2);
        }
        int count=0;
        for(List<Integer> i:n1)
        {
            for(List<Integer>j:n2)
            {
                if(i.equals(j))
                {
                    count++;
                }
            }
        }
        return count;
        
    }
}