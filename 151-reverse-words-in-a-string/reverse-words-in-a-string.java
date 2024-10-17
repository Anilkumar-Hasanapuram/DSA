class Solution {
    public String reverseWords(String s) {
        String s1[]=s.split("\\s+");
        int n=s1.length;
        String arr[]=new String[n];
        int index=0;
        for(int i=n-1;i>=0;i--)
        {
            arr[index++]=s1[i];
        }
        return String.join(" ",arr).trim();     
    }
}