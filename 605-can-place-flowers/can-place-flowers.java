class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m=flowerbed.length,count=0;
        for(int i=0;i<m;i++)
        {
            if(flowerbed[i]==0)
            {
                int perv=(i==0 || flowerbed[i-1]==0)?0:1;
                int next=(i==m-1 || flowerbed[i+1]==0)?0:1;
                if(perv==0 && next==0)
                {
                    flowerbed[i]=1;
                    count++;
                }
            }
        }
        return count>=n;
    }
}