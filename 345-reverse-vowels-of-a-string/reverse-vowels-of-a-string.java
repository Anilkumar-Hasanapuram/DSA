class Solution {
    public String reverseVowels(String s) {
        int start=0,end=s.length()-1;
        char ch[]=s.toCharArray();
        while(start<end)
        {
            if("aeiouAEIOU".indexOf(s.charAt(start))!=-1 && "aeiouAEIOU".indexOf(s.charAt(end))!=-1 )
            {
                char c=ch[start];
                ch[start]=ch[end];
                ch[end]=c;
                start++;
                end--;
            }
            else if("aeiouAEIOU".indexOf(s.charAt(start))!=-1 && "aeiouAEIOU".indexOf(s.charAt(end))==-1 )
            {
                end--;
            }
            else
            {
                start++;
            }

        }
        return new String(ch);
        
    }
}